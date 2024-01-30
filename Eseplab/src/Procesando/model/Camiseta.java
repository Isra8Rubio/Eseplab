package Procesando.model;

public final class Camiseta extends Prenda {
    public Camiseta() {
    }

    public Camiseta(String material, String color) {
        super(material, color);
        lavado();
        lejia();
        planchado();
        secadora();
    }
}
