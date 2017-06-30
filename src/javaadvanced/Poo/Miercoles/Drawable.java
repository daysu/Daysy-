
package javaadvanced.Poo.Miercoles;

/**
 *
 * @author CC-16
 */
public interface Drawable {
    void draw();
}
class Superheroe implements Drawable{

@Override
public void draw(){
    System.out.println("Dibujando a superman");

}

}
class SuperVillano implements Drawable{
@Override
public void draw(){
    System.out.println("Dibujando a lex Luthor");


}
}
class Historia{
    public static void main(String[] args) {
        Drawable d,e;  //multiples objetos
        d=new Superheroe();
        e=new SuperVillano();
        
        d.draw();
        e.draw();
        
        
    }

}



