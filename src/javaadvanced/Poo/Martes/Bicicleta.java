package javaadvanced.Poo.Martes;

class Vehiculo {

    void run() {
        System.out.println("El vehiculo eta corriendo");
    }
}

public class Bicicleta extends Vehiculo {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.run();
    }

    void run() {
        System.out.println("la bicicleta esta corriendo");

    }
    
}
