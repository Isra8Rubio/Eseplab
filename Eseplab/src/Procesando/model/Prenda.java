package Procesando.model;

import Procesando.constantes.Constantes;

public abstract class Prenda {
    private String material, color;
    private boolean lavado, planchado, secadora, lejia;

    public Prenda() {
    }

    public Prenda(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public boolean lavado() {
        if (material == Constantes.MATERIAL_POLIESTER || material == Constantes.MATERIAL_ALGODON) {
            System.out.println("Lavado a máquina");
            return true;
        } else {
            System.out.println("No se puede lavar a máquina");
            return false;
        }
    }

    public boolean lejia() {
        if (color == Constantes.COLOR_BLANCO && material == Constantes.MATERIAL_ALGODON ||
                material == Constantes.MATERIAL_POLIESTER) {
            System.out.println("Se puede usar lejía");
            return true;
        } else {
            System.out.println("No se puede usar lejía");
            return false;
        }
    }

    public boolean planchado() {
        if (material != Constantes.MATERIAL_SEDA) {
            System.out.println("Se puede planchar");
            return true;
        } else {
            System.out.println("No se puede planchar");
            return false;
        }
    }

    public boolean secadora() {
        if (color == Constantes.COLOR_BLANCO && material == Constantes.MATERIAL_ALGODON ||
                material == Constantes.MATERIAL_POLIESTER) {
            System.out.println("Se puede usar lejía");
            return true;
        } else {
            System.out.println("No se puede usar lejía");
            return false;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLavado() {
        return lavado;
    }

    public void setLavado(boolean lavado) {
        this.lavado = lavado;
    }

    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

    public boolean isSecadora() {
        return secadora;
    }

    public void setSecadora(boolean secadora) {
        this.secadora = secadora;
    }

    public boolean isLejia() {
        return lejia;
    }

    public void setLejia(boolean lejia) {
        this.lejia = lejia;
    }
}
