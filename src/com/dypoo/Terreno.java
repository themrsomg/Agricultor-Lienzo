package com.dypoo;

public class Terreno {

    private double ancho;
    private double alto;

    public Terreno(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double superior(double x) {
        return 70 + 8 * Math.sin(x / 35) * Math.cos(x / 20);
    }

    public double inferior(double x) {
        return 50 + 5 * Math.cos(x / 10) * Math.sin(x / 15);
    }

    public double desperdicio(double x) {
        return superior(x) - inferior(x);
    }

    public double AreaFinal(int precision) {
        return (ancho * alto) - Reimman.ReimmanArea(0, ancho, precision, this);
    }
    public double restaArea(double x){
        return 10000 - 8113.1456 ;
    }
}
