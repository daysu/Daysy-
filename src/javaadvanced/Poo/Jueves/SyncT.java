package javaadvanced.Poo.Jueves;

/*la sincronisacion en java es la capacidad de controlar 
el acceso de multiples hilos en cualquier recurso compartido

la sincronizacion es la mejro obcion cuando queremos 
permitir que solo un hilo pueda acceder a recursos compartidos.

la sincronizacion es principalmente usada para:
1.- prevenir la interferencia de hilos
2.-Prevenir problemas de inconsistencia 

Tipos de Sincronizacion 

1.- Procesos
2.-Hilos: Mutuamente Excluyentes 
    1.-Metodo sincronizado
    2.-Sincronizacion Estatica
    3.-Sincronizaion Estatica
Cooperacion : Comunicacion entre hilos 
Exclusion Mutua:Ayuda aprevenir que los hilos
    interfieran entre si mientras comparten informacion.
Bloqueo: la sincronizacion se basa en una entidad interna conocida 
    como lock o monito. cada objeto tiene un bloqueo asociado a el.
por convencion un hilo necesita un accso consistente 
a los campos de un objeto, tiene que adquirir el bloqueo
del objeto  ntes de acceder a ellos y a continuacion liberar el bloque cuando
se hace con ellos.
desde java 5, el paquete java.util.curru



//entender el programa de impresion en desorden
// agregando syncronized imprime el orden
 */
class Tabla {

    void imprimir(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {

                Thread.sleep(4000);

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

}

class Hilo1 extends Thread {

    Tabla t;
    Hilo1(Tabla t) {
        this.t=t;
    }



    @Override
    public void run(){
t.imprimir(100);


}

public class SyncT {
}
    public static void main(String[] args) {
        Tabla ob = new Tabla();
        Hilo1 t1 = new Hilo1(ob);
        Hilo1 t2 = new Hilo1(ob);
        t1.start();
        t2.start();

    }

}
