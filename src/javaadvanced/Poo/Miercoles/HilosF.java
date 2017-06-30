
package javaadvanced.Poo.Miercoles;

/*
Hilo: Subproceso ligero,unidad pequeña de 
procesamiento. Es una vida de ejecucion.
separada.
lsos hilos son idependientes, si se produce una exepcion en un hilo
no afecta a los demas hilos y comparten un area en memoria
comun.
Ventajas de usar hilos:
1.- No bloqueamo a los usuarios por que son tareas al mismo tiempo.
2.-podemos realizar muchas tareas simultaneamente ahorrando tiempo.
3.-Los holos al ser independientes no se afectan entre si, en caso de ocurrir
, una execepcion en un hilo los demas funcionan igual
Multitarea:proceso de ejucucion simultaneamente.
Usamos la multitarea en el cpu. se logra de dos maneras:
1.-Multitarea basada en proceso tiene su propia direccion en memoria, es decir 
cada proceso asigna un area de memoria separada
-El proceso es pesado.
-El costo de la comunicacion entre 
el es alto
-cambiar de proceso a otro requiere de tiempo para guardar
y cargar registros, mapa de memoria ,
lists de actualizacion .
2.-Multitarea basada en hilos (Multihilos)
-los hilos comparten los mismos espacios en memoria para direcciones-
-el hilo es ligero
-el costo de la comunicion entre hilos es bajo
(Paralelismo)Multihilos 
(Concurrencia)Es una propiedad de  los sistemas para soportar la multiples
peticiones , auxiliandose de intiprocesamiento y Multihilo logrando 
la multitarea.
ciclo de vida de un hilo
 un hilos puede encontrarse en unos de sus 5 estados 
de acuerdo con oracle solo hay 4 en el ciclo de ejecutarble (Running)no existe.
new,runnable, non-runnable, and terminated.

new: el  hilo esta en estado, si se crea una instancia de la clase Thread pero antes de 
lainvocacion de start)
Runnable: el hilo esta aqui, depues de ñla invocacion del metodo start(),
pero el Thread 
Running: el  hilo esta qui cuadno el TS lo ha seleccionado.
Non-Tunnable:Bloked: es el estado cuando el hilo sigue activo, sin embargo 
no es apto para ejacutasrse.
Terminated:es  el estado cuando sale del metos}do run()

hay 2  formas de crear  un hilo
1.-al esxtender de la clase Thread
2.-al implenmentar interface Runnable


proporcion alos constructores y metodos para crea y realizar operaciones en un
un hilo
constructores comunes de la clse Therad
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)


 */
//como crear un hilo
public class HilosF extends Thread{
    @Override
    public void run(){
        System.out.println("el hilo esta corriendo");
   }
    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        hilo.start();
        
    }
}
//Ejemplo Runnable
class Hilos implements Runnable {

    @Override
    public void run() {
        System.out.println("el hilo runnable esta "+"corriendo");
       
    }
    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
}
/*

Metodos Callbacks
public void run(){
//se inicializa para realizar la accion de un hilo

}
//public void start(){.
}
public void yield(){
}
public void suspend(){
//deprecado
//para suspender el hilo
}
public void stop(){
//deprecado
//se utilizan para detener el hilo
}
public booleanisDaemon(){
//verifica si un hilo es demonio
}
public void setDaemon(){
//marca el hilo como un demonio
}
public void interrupt(){
//interrumpe un hilo
}
public void interrupted(){
//verifica si el hilo se puede interrumpir
}
lic void interrupt(){
//interrumpe elhilo
}
lic boolean interrupted(){
//verifica si el hilo se puede interrumpir
}
lic static boolean interrupted(){
//prueva si el hilo actual se ha interrumpido
}
*/


