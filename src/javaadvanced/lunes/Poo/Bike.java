/*
Clase: conjunto de objetos con caracteristicas similares 
que se identifican por nombre, atributos y funciones o
metodo aplicables a todo conjunto.
Es una plantilla para caracterizar o definir objetos.

Abstraccion:Es la facultad intuitiva que permite conocer 
la esencia de las cosas

Modularidad:Es un proceso mental que permite distinguir  los componentes
de los objetos que estan siendo estudiado

Encapsulamiento:Permite ocultar las caracteristicas no relevantes de 
una clase , destacaar las relevantes 
y modelar su comportamiento. dando como resultado
la abstraccion de datos.

Herencia:Relaccion en clases cuya existencia depende de un ancestro ,
clase base delega sus atributos y 
metodos a las clases  derivadas.

Polimorfismo:Es el conjunto de operaciones aplicables  a un objeto 
por medio de los mensajes que invoca a alguno de los metodos 
definidos en la clase
a la que pertenece el objeto de acuerdo al dominio de la aplicacion(Contexto)

Objeto: Es una entidad real o imaginaria que tiene identidad , 
estado y un comportamiento,
conforme al conjunto de objetos(clase)a la que pertenece. es una 
instancia de una mujer con clase.
Mujer muje  = new Mujer();

una clase en java contiene lo siguiente:
campos
metodos
contructores //reserva el espacio en memoria
bloques
clases anidadas e interfaces 

class<class name>{
field;
method;
}
variables de instancia 
Mujer mujer = new mujer();

*/
package javaadvanced.lunes.Poo;

public class Bike {
    public static void main(String[] args) {
  show();
    }
 public void show(){
         MountainBike bici = new  MountainBike();
         String msg="Soy una bici de montaña";
        msg +="y mi color es :"+bici.getColor();
        msg +="y mi color es :"+bici.getVelocidad();
        msg +="velocidades ";
        System.out.println(msg);
     }
     public int getVelocidad(){
         int velocidad = 0;
        return velocidad;
     }
 
    
    protected boolean setVelocidad (int velocidad){
   ;
        return false;
} else {
return false;
}
}
 
   

/*se me cayo un arete mientras preparaba mi cafe 
en la taza con cafe y este no se mojo
algoritmo 
clase encapsulada 
main
uml capsulas
programa

   
    */

