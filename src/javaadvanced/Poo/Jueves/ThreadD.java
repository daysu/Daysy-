/*
Un hilo en java es un hilo proveedor de servicios que
proporciona servicios al hilo de su vida depende de los demas hilos ,
es decir si todos los demas hilos se mueren la JVM lo termina 
automaticamente.

hay muchos hilos demonios en java que se ejecutan 
automaticamente. Garbage Collector, finalizer, etc.
JConsole en el simbolo de sistema, proporciona 
la informacion sobre las clases cargadas , uso de mamoria, ejecucion 
de hilos, etc.

puntos importantes:

un hilo en java proporciona servicios a ls hilos 
para brindar soporte a tarea en segundo plano.

su vida depende de los hilos de usuarios Es un hilo de  baja prioridad.
java.lang.Thread provee dos metodos para un demonio.
1.-public setDaemon(boolean status)es usado para marcar un hilo demonio.
2.-public 


 */
package javaadvanced.Poo.Jueves;

/**
 *
 * @author CC-16
 */
public class ThreadD extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Tenemos un demonio aqui");
        } else {
            System.out.println("Ah no es un hilo de usuario");
        }
    }

    public static void main(String[] args) {
        ThreadD t1 = new ThreadD();
        ThreadD t2 = new ThreadD();
        ThreadD t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
