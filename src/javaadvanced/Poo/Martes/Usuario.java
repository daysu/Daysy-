/*Modificadores: public, private,protected/default
Tipo de retorno }: int, double...
Lista de Parametros:x,y,ciudad Math(X,2);
                                Math(2,X)
Override:Redefinicion 
Overload:Sobrecarga




*/

package javaadvanced.Poo.Martes;

//Agregacion entre clases:Agregacion HAS-A
public class Usuario {
    int id;
    String nombre;
    Direccion Direccion;
    
    Usuario (int id,String  nombre,Direccion Direccion){
        this.id= id;
        this.nombre=nombre;
        this.Direccion=Direccion;    
    }
    public static void main(String[] args) {
        Direccion dir= new Direccion ("culiacan","sinaloa","Mexico");
        Direccion dir2= new Direccion ("culiacan","sinaloa","Mexico");
        
        Usuario u =new Usuario(111,"jose",dir);
        Usuario u2 =new Usuario(112,"pedro",dir);
        u.show();
        u2.show();
 }
    void show(){
    System.out.println(id+""+nombre);
        System.out.println(Direccion.ciudad+"\n"+Direccion.estado+"\n"+Direccion.pais);
    }
}
class Direccion{
    String ciudad,estado,pais;
  Direccion(){
 }
    Direccion (String ciudad,String  estado,String pais){
        this.ciudad= ciudad;
        this.estado=estado;
        this.pais=pais;
}
}


