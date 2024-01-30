package Procesando.model;

public final class Pantalon extends Prenda {
    public Pantalon() {
    }

    public Pantalon(String material, String color) {
        super(material, color);
        lavado();
        lejia();
        planchado();
        secadora();
    }

}
