
package javaadvanced.Poo.Martes;
/*
 Es un avariable de autoreferencia.
This tiene 6 usos en java 
*This, se una para refererir a la variable
de instancia d la clase actual.
*This para invocar el metodo de una clase 
actual
*This() para invocar al constructor de una clase(actual).
*This puede ser pasado como argumento en la llamada a un metodo.
*This se puede pasar como argumento en la llamada constructor
*This se puede utilizar para devolver la instancia de la clase actual 
del meodo.
 */
public class Student {
    int matricula;
    String nombre;
    String Universidad;
    //caso6
    public Student(){
    
    
    }
    Student 
    //caso5
    PruevaEstudiante obj;
    
    public Student( PruevaEstudiante obj){
        this.obj=obj;
  }
}
    void s (){
        System.out.println(obj.dato);
    
    
    public Student(){ 
        System.out.println("soy el contructor por default");
    } 
    
    public Student(int matricula,String nombre,String Universidad){
        this.matricula=matricula;
        this.nombre =nombre;
        this.Universidad=Universidad;
 }
    void display(){
        String msg="matricula  es:"+matricula;
        msg+="\n El nombre es:"+nombre;
        msg+="\n El nombre es:"+Universidad;
        System.out.println(msg);    
    
 
    class PruebaEstudiante()  
public static void main(String[] args) {
        Student s1= new Student(111,"karla","tec");
        Student s2= new Student (112,"Darla","tec");
        Student s3=new Student (113,"Sonia","tec");
        Student s4=new Student (114,"yesi","tec");
}



}
}
   