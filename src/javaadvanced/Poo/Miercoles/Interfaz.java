package javaadvanced.Poo.Miercoles;
/**
 Una interface en java es un modelo de una clase.
 * Tiene constantes estaticas y metodos abstractos.
 * la interface en java es un mecanismo para lograr la 
 * abstraccion. solo puede contener metodos implementacion(como lo hace).
 * Tambien permite la simulacion de herencia multiple.
 * Representa uanrelacion IS-A 
 * no se puede instanciar.. como las clases abstractas 
 * ¿porque utilizan interface?
 * para lograr la abstraccion 
 * por interface podemos simular la herencia multiple
 * para lograr un objeto acoplamiento
 * a partir de java 8, la interface contiene metodos predeterminados y estaticos.
 */



interface Mostrar{
    //que hace..
void show();//metodo show 
}

public class Interfaz implements Mostrar {
    
    @Override
    public void show(){
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
                i.show();
    
}
}             

    






















