package javaadvanced.Poo.Martes;
/*Costructor de una clase: conjunto de instrucciones 
diseñado para crear inicializar una instancia de una clase
en su declaracion o encabezado puede aceptarparametros.

Bike b = new Bike();
Bike ()<- hace referencia al constructor 
por omision.
antes de su ejecucion, b es null; al final de la llamada 
"b" es un apuntador a un objeto (referencia) con espacio reservado RAM 
para contener sus valores de atributos y sus apuntadores a metodos.

¿Porque el constructor no es un metodo?
No puedo llamar al constructor usando el 
operador de indereccion. 
Carese de un valor de retorno distinto a un apuntador.
No puede ser REDEFINIDO ()
No puede ser declerado con un type
*/
public class Bike {
    //propiedades del objeto 
    int velocidad;
    String color;
    String Marca;
    
  //Declaro el constructor  implicito

    public Bike(){
 
    }
    public Bike(String color,String Marca, int velocidad){
    this.velocidad=velocidad;
    this.color=color;
    this.Marca=Marca;
  
}

    
 public int getVelocidad(){ return velocidad;}
    public String getColor(){ return color;}
    public String getMarca() { return Marca;}
    
}

