package app;

import model.Cachorro;
import model.Gato;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Lua");

        gato.emitirSom();
        gato.colocarDomir();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Lui");

        cachorro.emitirSom();
        cachorro.colocarDomir();
    }
}
