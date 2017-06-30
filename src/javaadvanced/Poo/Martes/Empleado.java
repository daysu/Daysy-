
package javaadvanced.Poo.Martes;
/*
Herencia: es un mecanismo que permite que un objeto adquiera 
todas las prpiedades y comportamientos  de un objeto padre.
la idea de herenci es que puedas crear nueva clases 
a partir de las ya existentes .
Existen  diversas clasificasiones de relacion 
en la herencia 
Relaciones entre clases : Asociasion , Composicion, Agregacion, Herencia.
hay un termino que permite distinguir el diferente tipo
de relaciones llamado ACOPLAMIENTO.
-Medida de la dependencias que hay entre 2 modulos, existen grados de acoplamiento 
(bajo o alto)
-cada clase y metodo hace una sola cosa y hace bien(COHESION). 
numero de tareas que tiene cada clase o metodo
Es deseable que 2 o mas modulos de programa mantengan alta cohesion y
bajo acoplamiento
Relaciones entre clases:
Asociasion(Es un):Cuando entre 2 o mas clases se da una iteraccion que no 
modifica en nada el comportamiento de los objetos antes o depues de 
terminada relacion.
la asociacion es un modo de interaciones entre objetos donde se utiliza los
servicios de otro acorto plazo

la asociacion  es una relacion de objetos debilmente acoplamiento.

Agregacion(Tiene un): Es una relacion eentre objetos que afecta el
comportamiento entre 
ellos mientra que dura la relacion, Es decir , un objeto depende
de los servicios de otro a largo plazo.
Composicion(contiene): cuando un objeto completo usa otros objetos 
peermanentemente la composicon es una relacion entre objetos cuya
escencia tiene sentido solo cuando ellos estan acoplados.
por ultimo que la composicion es un tipo de agragacion a muy largo plazo.

Herencia: cuando un objeto tiene las caracteristicas de otro permanentemente
, tendremos una relcion entre objetos intimamente acoplados cuya existencia 
dependen de un ancestro irrenunciablemente.
*/
//Relacion  de asociasion IS-A
public class Empleado {//Herencia multinivel 
    double salario=40000;
}
class Programador extends Empleado{//Herencia multinivel 
    int  bono=1000;
    
    public void main() {
        Programador p= new Programador();
        System.out.println("El salario del programor es:" +p.salario);
        System.out.println("El abono del programador es " +p.bono);
       
    }
    void mensaje(){
        System.out.println("Soy un programador");
        main();
    }
      
}
//Herencia simple es de Empleado a Programador
//Herencia multinivel Emplado a Programador
//Herencia jerarquica  Empleado a Programador
//Empleado a Web
class Web  extends Programador {
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }



}
