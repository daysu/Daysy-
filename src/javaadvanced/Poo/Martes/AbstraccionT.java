package javaadvanced.Poo.Martes;

/*abstraccion:accion de separar mentalmente la
representacion de las caracteristicas 
esenciales de un objeto , sin incluir antecedentes 
o detalles irrelevantes.
es el proceso natural en los seres humanos
de de poseer la facultad intuitiva de conocer la esencia de las cosas 
Existen 5 tipos de abstraccion.
    funcional,parametrica, de datos, contextual y generica
*Funcional: sirve para modelar la interaccion logica,
es decir como se dara las instrucciones de: 
planteamiento,entrada,procesamiento , salidas y navegabilidad el algoritmo
*de Datos: permite delimitar los atributos y sus metodos que deben 
servir para modelar una clase de objetos tomando en cuenta sus alcanses
, sus tipo de datos sus parametros y sus valores de retorno
*Contextual:proceso mental que comienza con el analisis de un fenomeno
,amalgamando las abstracciones de dato y funcional para integrar uns solucion 
automatizada, que utilice de cierto, los acervos de conocimientos previos
y tome en cuenta las restricciones y los riesgos.

Parametricas: cuando se diseñan los metodos y las operaciones de las abstracciones 
de datos, funcionales que es posible evitar si se parametrizan apropiadament y
, con esto se ahorra codigo y se tiene una mayor legibilidad, flexibilidad 
y mantenibilidad en los desarrollos de software.

Generica:Es un tipo especial de abstraccion paramerica 
que se usa en las clases genericas paro en lugar de paremetrizan tipos 
de dato su objetivo es la reutilizacion de algoritmos.

EN JAVA
Una clase declarada con la palabra reservada Abstract
se considera abstracta de nombre.
puede ser abstracta con metodos no abstractos.

la abstraccion es un proceso para ocultar lso detalles de implementacion
y mostrar solo la funcionabilidad al usuario.
Enviar sms solo escribe el texto y lo envia 
no conocemos el proceso interno sobre la entrega de mensaje.
la abstraccion permite concentrarse en LO QUE HACE el objeto 
en lugar del COMO LO HACE.
Formas de lograr la Abstraccion:
1.-Clase Astracta (0 a 100%)
2.-Interface(100%)

una clase declarada abstracta necesita ser extendida (extends) e implementar 
sus metodos.no se puede instancia
abstract class A{}
un metodo que es declarado como abstracto



 */
abstract class Shape {

    abstract void draw();//declaracion

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("dibujando un circulo");

    }
}

public class AbstraccionT extends Shape {

    public static void main(String[] args) {
        Shape s = new AbstraccionT();
        Shape s2 = new Circle();
        s.draw();
        s2.draw();
    }

    @Override
    void draw() {
        System.out.println("dibujando ");
    }
}
