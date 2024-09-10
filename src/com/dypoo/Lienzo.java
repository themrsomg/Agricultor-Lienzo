package com.dypoo;

import javax.swing.*;
import java.awt.*;

public class Lienzo {
    private int size;
    private char[][] lienzo;
    private Terreno terreno;

    public Lienzo(Terreno terreno) {
        size = 100;
        lienzo = new char[size][size];
        this.terreno = terreno;
    }

    public void clean() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }

    public void setPen(int x, int y, char c) {
        if (x < 0 || y >= size) return;
        int pos = size - 1;
        lienzo[pos - y][x] = c;
    }

    public void dibujar() {
        StringBuilder lienzoteXto = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                lienzoteXto.append(lienzo[i][j]).append(" ");
            }
            lienzoteXto.append("\n");
        }

        JFrame frame = new JFrame("Dibujo");
        JTextArea textArea = new JTextArea(lienzoteXto.toString());
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void dibujarGrafica() {
        clean();
        for (int i = 0; i < size; i++) {
            double x = i;
            int ySuperior = (int) terreno.superior(x);
            int yInferior = (int) terreno.inferior(x);

            setPen(i, ySuperior, '█');
            setPen(i, yInferior, '█');

            for (int y = yInferior + 1; y < ySuperior; y++) {
                setPen(i, y, '▒');
            }
        }
        dibujar();
    }
}
