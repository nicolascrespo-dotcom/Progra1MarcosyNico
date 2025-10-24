package com.rpg;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class panelJuego extends JPanel implements Runnable,KeyListener {
    public final int ANCHO_PANTALLA= 800;
    public final int ALTO_PANTALLA= 600;

    int heroeX= ANCHO_PANTALLA / 2;
    int heroeY= ALTO_PANTALLA / 2;
    final int VELOCIDAD_HEROE= 4;

    public boolean arribaPresionada, abajoPresionada, izquierdaPresionada, derechaPresionada;

    Thread hiloJuego;
    public panelJuego(){
        this.setPreferredSize(new Dimension(ANCHO_PANTALLA,ALTO_PANTALLA));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
    }
    
    public void iniciarHiloJuego() {
        hiloJuego= new Thread(this);
        hiloJuego.start();

    }

    @Override
    public void run(){
        while (hiloJuego !=null){
            actualizar();
            repaint();
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
    @Override
    public void keyReleased(KeyEvent e){
        int codigoTecla = e.getKeyCode();

        if(codigoTecla==KeyEvent.VK_W){
            arribaPresionada= false;
        }if(codigoTecla==KeyEvent.VK_A){
            izquierdaPresionada= false;
        }if(codigoTecla==KeyEvent.VK_S){
            abajoPresionada= false;
        }if(codigoTecla==KeyEvent.VK_D){
            derechaPresionada= false;
        }
    }
    @Override
    public void keyPressed(KeyEvent e){
        int codigoTecla =e.getKeyCode();

        if(codigoTecla==KeyEvent.VK_W){
            arribaPresionada= true;
        }if(codigoTecla==KeyEvent.VK_A){
            izquierdaPresionada= true;
        }if(codigoTecla==KeyEvent.VK_S){
            abajoPresionada= true;
        }if(codigoTecla==KeyEvent.VK_D){
            derechaPresionada= true;
        }
    }
    @Override
    public void keyTyped(KeyEvent e){

    }
    @Override
    public void actualizar(){

        if (arribaPresionada){

            heroeY = heroeY - VELOCIDAD_HEROE;
        }else if (abajoPresionada){

            heroeY = heroeY + VELOCIDAD_HEROE;
        }
        
        if (izquierdaPresionada){

            heroeX = heroeX - VELOCIDAD_HEROE;
        }if (derechaPresionada){

            heroeX = heroeX + VELOCIDAD_HEROE;
        }

    }
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);


        g.setColor(java.awt.Color.white);
        g.fillRect(heroeX, heroeY,32,32);
        g.dispose();
    }
}
