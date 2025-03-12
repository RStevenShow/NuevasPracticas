package com.mycompany.nuevaspracticas;

import javax.swing.*;

public class Ventana extends JFrame {
    Lienzo l = new Lienzo();
    
    public Ventana(){
        setLayout(null);
        setBounds(100,100,800,700);
        add(l);
        
        
        
       
        
    }
    public static void main(String[] args) {
       Ventana v = new Ventana();
        v.setVisible(true);
        
    }
   
}
