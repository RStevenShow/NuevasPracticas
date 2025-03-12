package com.mycompany.nuevaspracticas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Lienzo extends JPanel implements ActionListener {
    private int x = 20;
    private int y = 20;
    private int dx = 5;
    private int dy = 5;
    private final int RADIO = 50;
    Timer timer;
    public Lienzo(){
    setLayout(null);
    setBounds(20, 10, 750, 450);
    setBorder(new EtchedBorder());
    rebote();
    }
    @Override
    public void paint(Graphics g){
      super.paint(g);
      g.setColor(Color.red);
      g.fillOval(x, y, RADIO, RADIO);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += dx;
        y += dy;
        if(x <= 0 || x + RADIO >= this.getWidth())
            dx *= -1;
        if(y <= 0 || y + RADIO >= this.getHeight())
            dy *= -1;
        repaint();
    }
    public void rebote(){
        timer = new Timer(5, this);
        timer.start();
    }
}
