package javaadvanced.Poo.Martes;

/*
la palabra reservada estatic es usada para 
la administracion de memoria principalmente. 
Es aplicada a variables, metodos,boques y clases anidadas.
la palabra  static pertenece a la clase que la
instancia
para variables: se pude utilizar para referer una propiedad comun en todos 
los objetos.las variables estaticas obtienen memoria solo una vez en el area de la clase 
n el momento que se crea.
promueve la eficiencia en el rendimiento del programa
 */
public class Estudiantes {

    int matricula;
    String nombre;
    String Universidad = "LAQUESEA";

    Estudiantes(int m, String n) {
        matricula = m;
        nombre = n;
    }

    void show() {
        System.out.println(matricula + "" + nombre + "" + Universidad);
        Estudiantes s1 = new Estudiantes(111, "Fer");
        Estudiantes s2 = new Estudiantes(112, "Emanuel");

        s1.show();
        s2.show();
    }
    public static void main(String[] args) {
        
    }

}
