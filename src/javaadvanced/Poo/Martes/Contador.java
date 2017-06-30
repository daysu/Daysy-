package javaadvanced.Poo.Martes;
/*
Restricciones de Static 
No puede utilizar miembros no estaticos 
para referencias.
this y super no pueden ser utilizadas en un contexto 
estatico
*/

public class Contador {
   static int i=0;
    
    public Contador(){
        i++;
        System.out.println(i);
  }
    public static void main(String[] args) {
        Contador i1 = new Contador();
        Contador i2 = new Contador();
        Contador i3 = new Contador();
    }
    
    
   
}
