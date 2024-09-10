package com.dypoo;

import javax.swing.*;

public class Agricultor {
    public static void main(String[] args) {
        Terreno terreno = new Terreno(100, 100);
        JOptionPane.showMessageDialog(null, "Área efectiva: " + terreno.AreaFinal(5000));
        System.out.println("Área efectiva: " + terreno.AreaFinal(5000));
    }
}
