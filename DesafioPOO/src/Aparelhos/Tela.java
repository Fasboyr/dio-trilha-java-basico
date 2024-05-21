package Aparelhos;

import Aparelhos.Celular.Iphone;

public class Tela {
    public static void main(String[] args) {
        Iphone celular = new Iphone();

        celular.ligar("97206544");

        celular.exibirPagina("youtube.com");

        celular.selecioanrMusica("Gangnam Style");
    }
    
}
