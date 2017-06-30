package javaadvanced.Poo.Jueves;
public class ThreadT extends Thread{
    
    public void run(){
        System.out.println("corriendo");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadT t1 = new ThreadT(),t2 = new ThreadT(),
                t3= new ThreadT();
        System.out.println("Nombre del hilo:"+t1.getName());
        System.out.println("Nombre del hilo:"+t2.getName());
        System.out.println("Nombre del hilo:"+t2.getName());
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");
         System.out.println("Nombre del hilo ahora es:"+t1.getName());
        System.out.println("Nombre del hilo ahora es:"+t2.getName());
        System.out.println("Nombre del hilo ahora es:"+t2.getName());
    }
}
