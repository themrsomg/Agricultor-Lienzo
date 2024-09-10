package com.dypoo;

public class Reimman {

    public static double ReimmanArea(double superior, double inferior, int numeroPasos, Terreno terreno) {
        double resultado = 0.0;
        double incremento = (inferior - superior) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = superior;

        for (int i = 0; i < numeroPasos; i++) {
            resultado += incremento * terreno.desperdicio(x + semiIncremento);
            x += incremento;
        }
        return resultado;
    }

}
