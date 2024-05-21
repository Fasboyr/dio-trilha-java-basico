package Aparelhos.Celular;
import Aparelhos.Internet.NavegadorInternet;
import Aparelhos.Musica.ReprodutorMusical;
import Aparelhos.Telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
   
    @Override
    public void tocar() {
        System.out.println("Tocando a musica no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada no Iphone");
    }

    @Override
    public void selecioanrMusica(String musica) {
        System.out.println("Selecionado a música " + musica + " no Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina do link: " + url + " no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina no Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " no Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Criando um correio de voz no Iphone");
    }
}
