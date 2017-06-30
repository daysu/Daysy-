package javaadvanced.Poo.Martes;

/*
 Es una palabra recervada en java como una variable refernecia
la cual es usada para servir de intermediario
entre la clase padre y la subclase

Usos de super 
1.-se puede utilizar para referir la variable de instancia de la clase padre 
inmediata.
2.-se puede utilizar para envocar el metodo de la clase padre inmediato
3.- se puede utilizar para emvocar al constructor de la clase padre
inmediata
 */
class Animal {

    private boolean Color;
    //caso 3

    Animal() {
        System.out.println("se ha creado animal");
    }

    void eat() {
        System.out.println("comiendo...");
    }

    class Perro extends Animal {

        //caso 3
        Perro() {
            super();
            System.out.println("se ha creado el perro");
        }
        //color 2

        @Override
        void eat() {
            System.out.println("comiendo...");
        }

        void dormir() {
            System.out.println("el perro esta durmiendo...");
        }

        void llamar() {
            super.eat();
            dormir();
        }
     
           //caso1
        String color = "cafe";
        void printCololor() {
            //imprime el color de la clse de perro
            System.out.println(color);
            //imprime el color de la clase de animal
            System.out.println(super.Color);
        }

      
    }
    }
        public class SuperTest {
            public static void main(String[] args) {
                //caso 3    Perro p = new Perro();
            
                //caso2
              new  Perro().llamar();
                //caso1
              new  Perro().printColor();
            }
        }

     
    
