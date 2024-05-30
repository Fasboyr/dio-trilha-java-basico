package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){        
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo ");
        }
    }

    public double calcularTotalXp(){
        return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public void imprimirConteudosInscritos(){
        System.out.println("Conteudo Inscritos " + nome);
        Set<Conteudo> conteudosInscritos = getConteudoInscritos();
        if(conteudosInscritos.isEmpty()){
            System.out.println(" - Nenhum conteúdo matriculado");
        }else{
            for(Conteudo conteudo : getConteudoInscritos()){
                System.out.println(" - " + conteudo);
            }
        }
    }

    public void imprimirConteudosConcluidos(){
        System.out.println("Conteudo Concluidos " + nome);
        Set<Conteudo> conteudosConcluidos = getConteudoConcluidos();
        if(conteudosConcluidos.isEmpty()){
            System.out.println(" - Nenhum conteúdo concluído");
        }else{
            for(Conteudo conteudo : getConteudoConcluidos()){
                System.out.println(" - " + conteudo);
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return this.conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return this.conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        return Objects.equals(nome, other.nome) &&
               Objects.equals(conteudoInscritos, other.conteudoInscritos) &&
               Objects.equals(conteudoConcluidos, other.conteudoConcluidos);
    }
    

}
