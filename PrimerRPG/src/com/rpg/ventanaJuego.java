package com.rpg;

import javax.swing.JFrame;

public class ventanaJuego {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        panelJuego panelJuego= new panelJuego();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Setas quest");
        ventana.setResizable(false);
        

        ventana.add(panelJuego);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        panelJuego.requestFocusInWindow();
        panelJuego.iniciarHiloJuego();

    }
    
}
