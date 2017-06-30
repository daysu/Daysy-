package javaadvanced.Poo.Martes;

/*
el polimorfismo permite desplegar comportamientos distintos
en las subclases de una jerarquia de herencia cuando el las activa
metodos en la misma firma o signatura.
Ej. Empleado e = new Administrador();
para manipular el empleado como si fuera administrador
es necesario modelar el tipo de clase de las subclase
El hecho de que una variable apuntadora a un objeto
(Tal como la variable "e")puede refereise autommaticamente a tipos multiples
se llama polimorfismo.
La JVM automaticamento  slecciona el metodo apropiado a tiempo de ejecusion
lo que se denomina 
"lIGADURA DINAMICA ". en conclucion todas las variables tipo superclase 
concretas son polimorfica
 */
class Bike2 {

    void run() {
        System.out.println("running safely");
    }
}

public class Polimorfismo extends Bike2{

    void rund() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike2 b = new Polimorfismo();
        b.run();

    }
}
