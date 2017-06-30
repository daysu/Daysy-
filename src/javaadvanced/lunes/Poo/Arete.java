/*se me cayo un arete mientras preparaba mi cafe 
en la taza con cafe y este no se mojo
algoritmo 
clase encapsulada 
main
uml capsulas
programa
 */
package javaadvanced.lunes.Poo;

public class Arete {

    private String nombre;
    private String color;

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcolor(String color) {
        this.color = color;

    }

    public String getnombre() {

        return nombre;
    }

    public String getcolor() {

        return color;
    }

}

class TazaCafe {

    private String color;
    private int tamaño;
    private String pais;

    public void setcolor(String color) {
        this.color = color;
    }

    public void tamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int gettamaño() {
        return tamaño;
    }

}

class cafe {

    private String color;
    private String pais;

    public void setcolor(String color) {
        this.color = color;
    }

    public void setpais(String pais) {
        this.pais = pais;
    }

    public String getpais() {
        return pais;

    }

}


