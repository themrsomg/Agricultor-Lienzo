package com.dypoo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Terreno terreno = new Terreno(100, 100);
        Lienzo lienzo = new Lienzo(terreno);

        lienzo.dibujarGrafica();
        JOptionPane.showMessageDialog(null, "Área efectiva: " + terreno.AreaFinal(10));
        JOptionPane.showMessageDialog(null, "Área del rio: " + terreno.restaArea(0));
    }
}
