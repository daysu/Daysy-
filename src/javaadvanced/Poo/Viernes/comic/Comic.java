package javaadvanced.Poo.Viernes.comic;

import javaadvanced.Poo.Viernes.comic.LoadImageApp;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Comic extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {

                Thread.sleep(800);
                System.out.println(i);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("golpeando");
        }

    }

    interface Mostrar {
        //que hace..

        void show();//metodo show 
    }

    public class Interfaz implements Mostrar {

        @Override
        public void show() {
            System.out.println("Hola");
        }
    }

    class Hilos implements Runnable {

        @Override
        public void run() {
            System.out.println("el hilo runnable esta " + "corriendo");

        }
    }

    public static void main(String[] args) {
        Comic c = new Comic();
        Thread t = new Thread(c);
        t.start();

        JFrame f = new JFrame("historieta");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        }
        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
    
}

/*
    class Poderes extends Comic {

        public void run() {
            for (int i = 1; i < 5; i++) {
            try {

                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
                ie.printStackTrace();

            }
            System.out.println("corriendo");
        }
        }
    }
 */
