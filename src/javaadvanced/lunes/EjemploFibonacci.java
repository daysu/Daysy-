
package javaadvanced.lunes;

public class EjemploFibonacci {
    public static void main(String[] args) {
        int funcion1=3;
        int funcion2=2;
		System.out.println(funcion1);
		while (funcion1<50)
		{
			System.out.println(funcion2);
			funcion2+=funcion1;			
			funcion1 = funcion2 - funcion1;
    
    }
}
}
