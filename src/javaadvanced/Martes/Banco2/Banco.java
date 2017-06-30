/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.Banco2;

/**
 *
 * @author CC-16
 */
public class Banco {

    double getTazaDeInteres() {
        return 0;
    }
}

class Bancomer extends Banco {

    double getTazaDeInteres() {
        return 9.7;
    }
}
    class HSBC extends Banco {

        double getTazaDeInteres() {
            return 9.7;
        }
        }

        class Bancopel extends Banco {

            double getTazaDeInteres() {
                return 9.7;

            }

        }
            class TestP {
            public static void main(String[] args) {
        Banco b;
        b= new HSBC();
            System.out.println("Taza de interes de HSBC:"+b.getTazaDeInteres());
        
       
        b= new Bancopel();
            System.out.println("Taza de interes de Bancoppel:"+b.getTazaDeInteres());
        
        
        b= new Bancomer();
                System.out.println("Taza de interes de Bancomer:"+b.getTazaDeInteres());
        
        
    }
            }
        
    




