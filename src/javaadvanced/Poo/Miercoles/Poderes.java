/*
abstract class Poderes{// que es lo que hace
abstract  void volar();
abstract void golpear();
abstract void correr();
abstract void supervision();}

public void volar(){//como lo hace
loadImage a= new loadImage();
System.out.println("volando");
a.loadlmage(fly.jpg);
a.visible(true);
}
class-clase->extends
class-interface->implements
interface-interface->extends
class-abstract class ->extends
 */
package javaadvanced.Poo.Miercoles;

public class Poderes  {
     abstract void volar ();
    abstract void golpear();
    abstract void correr();
    abstract void supervision();
  



   //superman
    abstract class Superman extends Poderes{
   
    Superman S = new Superman() {
        @Override
        void volar() {
            System.out.println("esta volando");
        }

        @Override
        void golpear() {
            System.out.println("esta golpeando");
        }

        @Override
        void correr() {
            System.out.println("esta corriendo");
        }

        @Override
        void supervision() {
            System.out.println("utilizando surpervision");
        }
    
       public static void main(String[] args) {
         
            
        }
            
        

    
            
            
    
    
        
    
   
        

     

    
        
    



