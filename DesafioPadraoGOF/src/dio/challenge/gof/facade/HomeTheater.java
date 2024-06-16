package dio.challenge.gof.facade;

import subsistema2.DVDPlayer;
import subsistema2.Luzes;
import subsistema2.Projetor;

public class HomeTheater {
    private DVDPlayer dvdPlayer;
    private Projetor projetor;
    private Luzes lights;

    public HomeTheater(DVDPlayer dvd, Projetor projetor, Luzes luzes) {
        this.dvdPlayer = dvd;
        this.projetor = projetor;
        this.lights = luzes;
    }

    public void assistirFilme() {
        System.out.println("Prepare-se para assistir o filme...");
        lights.escurecer();
        projetor.on();
        projetor.setConfiguracao(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.reproduzir();
    }
}
