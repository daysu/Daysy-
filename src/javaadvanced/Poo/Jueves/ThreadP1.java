package javaadvanced.Poo.Jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

ThreadPool:
Representa un grupo de hilos que estan 
trabajando o esperar su turno 
para trabajar 
Mejoran el rendimiento, por que no necesita crear multiples instancias 
 */

public class ThreadP1 implements Runnable {

    private String msg;//variable llamada msg
//constructor
    public ThreadP1(String s) {//cuando la clase se cree va a recivir un msg
        msg = s;//envia mensage
    }

    @Override
    public void run() {//implemento run
        //cual es el nombre que se esta iniciando
        System.out.println(Thread.currentThread().getName() + "(Start)msg=" + msg);
        
        processMsg();              //pocesando msg
        
        //call
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    private void processMsg() {//lo que hace es hacer que aparescan los msg en un segundo o dos
        try {
            Thread.sleep(2000);

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }

}
class PruevaPl{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);//esta creando 5 hilos
        for(int i=0; i<10; i++){//imprime en ThreadPool
        Runnable worker = new ThreadP1(""+i);
        executor.execute(worker);
        
        }executor.shutdown();
        while(!executor.isTerminated()){}//mientras se estan creando los hilos que  el ejecutor no se acabe 
        System.out.println("Todos los hilos se han terminado");
                
    }
}