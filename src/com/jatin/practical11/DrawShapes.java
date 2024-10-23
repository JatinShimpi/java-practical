package com.jatin.practical11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawShapes extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 200, 100);
        g.drawOval(50, 50, 200, 100);
        g.drawLine(50, 200, 250, 200);
        g.setColor(Color.RED);
        g.drawString("Hello, Graphics!", 50, 250);
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Draw Shapes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        DrawShapes panel = new DrawShapes();
        frame.add(panel);
        frame.setVisible(true);
    }
}
