package javaadvanced.Poo.Martes;

/*
Firma o asignatura de un metodo 
Es lo que permite distinguir sin abiguedad
invocacion (Emision de mensaje) y contiene tres elementos :
el valor de retorno de (tipo): double
EL nombre del meto:pow
numero, tipo y orden de los parametros
Math.pow(x,2)   Math.pow(2,x).
En la herencia ademas de producir una clase nueva basada
en una antigua añadiendo caracteristicas adicionales (especializacion);
pueden extender el comportamiento existente de la superclase.
si un metodo  se define en la supclase de modo que 
el nombre , el tipo de retorno y su lista 
de parametros coinciden exactamente con algun 
metodo de la clase ancestro, entonces ese nuevo 
metodo decimo que REDEFINE el comportamiento de antiguo.
los metodos con el mismo nombre, pero diferente lista de parametros 
dentro de la mismo clase se consideran simplemente sobrecargados.
esto provoca que el compilador utilice los argumentos proporcionados en un 
mensje para determinar cual metodo ha de llamar.

To overload<- Sobrecarga
To override<-Redefine (Sobremontar)
/To overwrite<- Sobreescribir 
override:Metodo con la misma signatura en distintas clases 
(de una jerarquia de herencia)

overload:Metodo con el mismo nombre que la clase y distinta signatura
Reglas para definir Metodos:
1-.El tipode retorno del metodo redefinido  deve se identico al del metodo
que redefine.
2.-un metodo redefinido no puede ser menos accesible que el metodo que redefine 
super clase es publica, el redefinido no puede ser protected.
3.-un metodo redefinido no puede lanzar exepcion diferentes al metodo redefinido.

Diferencias entre sobrecarca  y redefinicion.
1.-la sobrecarga (overload)puede codificarse en una sola clase y la redefinicion
(override) requiere dos o mas clases
2.-los metodos sobrecargados tienen distinta asignatura
3.-los metodos redefinidos tienen 

 */
//sobrecarga
public class Adder {

    //camabiando el nuemro de argumentos
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
    //2.cambiando  el tipo de datos

    static int suma(int c, int d) {
        return c + d;
    }

    static double suma(double c, double d) {
        return c + d;
    }

    public static void main(String[] args) {
        //1cambiando en numero de arg
        System.out.println(Adder.add(111, 222));
        System.out.println(Adder.add(111, 222, 333));
        //2cambiando el tipo de datos
        System.out.println(Adder.suma(11, 22));
        System.out.println(Adder.suma(11, 222));

    }
}
