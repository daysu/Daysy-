package javaadvanced.Poo.Martes;

abstract class Bici {

    Bici() {
        System.out.println("la bicicleta se creo");
    }

    abstract void run();//metod abstraccto //que hace

    void changeColor() {
        System.out.println("Color cambiado");
    }
}

class Magistroni extends Bici { //implemetacion

    @Override
    void run() {

        System.out.println("soy una bicicleta");//como lo hace
    }
}

public class Abstraccion2 {

    void run() {

        System.out.println("la bici esta corriendo");
    }

    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}
