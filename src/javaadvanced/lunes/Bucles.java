/*un lazo , es usado para iternar una parte de 
programa muchas veces.

hay 3 tipos de lazos en java 
Simple For (arreglos)
For-each 
Labeled For (anidados)
*/
package javaadvanced.lunes;


public class Bucles {
    public static void main(String[] args) {
           //simple For
           /*
           for(inizialitation; condition; incr/dec){
           lo que sea
           }
           */
    for (int  i=1; i<=10; i++){
        System.out.println("Iterando el elemento "+i);
    }
    
    //for each 
    /*
    la estructura for each se utiliza para recorrer
    un arreglo o una coleccion en java.
    
    for(Type var: array){
    lo que sea
    }
    */
    int arreglo []={12,23,34,45,56,67};
    for (int a: arreglo  ){
        System.out.println(a);
    }
    
    //for Labeled
    for(int i =1; i<=3; i++){
        
        for(int j =1; j<=3; j++){
            if(i==2 && j ==2){
                break;   
            }
        System.out.println(i+" "+j);
    }
 }
}
}


 
    

