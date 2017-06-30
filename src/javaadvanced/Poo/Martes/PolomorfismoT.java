package javaadvanced.Poo.Martes;
public class PolomorfismoT {

    class Animal{

        void eat() {
            System.out.println("comiendo....");

        }
    }

    class Dog extends Animal{

        @Override
        void eat() {
            System.out.println("Comiendo croquetas");
        }
    }

    class Cachorro extends Animal {

        @Override
        void eat() {
            System.out.println("Tomando leche");
        }
    }

    public class PolimorfismoT {
    }


    public static void main(String[] args) {
        Animal a;

        a = new Animal();
        a.eat();

        a = new Dog();
        a.eat();

        a = new Cachorro();
        a.eat();

    }
}
