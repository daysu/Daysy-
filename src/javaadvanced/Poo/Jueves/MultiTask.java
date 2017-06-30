package javaadvanced.Poo.Jueves;
//hilo de multitareas , muchos hilos muchas tareas

public class MultiTask extends Thread {

    public void run() {
        System.out.println("Tarea a");

    }

    public static void main(String[] args) {
        MultiTask t1 = new MultiTask();
        MultiTask t2 = new MultiTask();
        MultiTask t3 = new MultiTask();
       
        t1.start();
        t2.start();
        t3.start();
    }

}

class M implements Runnable {

    @Override
    public void run() {
        System.out.println("tarea uno");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());

        TrueM t1m = new TrueM();

        t1.start();
        t2.start();
        t1m.start();

    }

}

class TrueM extends Thread {

    public void run() {
        System.out.println("Tarea dos");

    }

}

class TrueM1 extends Thread {

    public void run() {
        System.out.println("tarea b");
    }

}
