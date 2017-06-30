/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Poo.Miercoles;

abstract class Banco {
    abstract int getTasaDeinterese();
    
}
class HSBC extends Banco{

    @Override
    int getTasaDeinterese() {
        return 7;
    }
}
class Bancopel extends Banco{

    @Override
    int getTasaDeinterese() {
        return 9;
}
}
class Bancomer extends Banco{

    @Override
    int getTasaDeinterese() {
        return 8;
    }

}
class PruevaBanco{
    public static void main(String[] args) {
        Banco b;
        b= new HSBC();
            System.out.println("Taza de interes de HSBC:"+b.getTasaDeinterese());
        
       
        b= new Bancopel();
            System.out.println("Taza de interes de Bancoppel:"+b.getTasaDeinterese());
        
        
        b= new Bancomer();
                System.out.println("Taza de interes de Bancomer:"+b.getTasaDeinterese());
        
        
    }


}
