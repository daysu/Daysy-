/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Poo.Jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
ja I/O
 Entrada y salida
 * se utiliza para procesar las entrada y salida .
 * en java se utiliza el concepto Stream(flujo)
 * para hacer que las operacones E/S sean rapidas.
 * 
 * El paqute java.io contiene todas las clases necesarias para realizar 
 * operaciones de entrada y salida.
 * podermos realizar el manejo de archivos atraves  de java I/O API
 * 
 * Stream: es un flujo de datos, qeu estan compuestos por byt
 * que se llama Stream porque es como un flujo de agua que sigue corriendo.
 * En java existen tres Streams que se crean para nuestro uso automaticamente.
 * 1.-System.out: flujo de salida estandar
 * 2.-System.in: flujo de entrada estandar
 * 3.-System.err: flujo de errores estandar
 * System.out.print("Error");
 * System.out.print("Error");
 * OutpuntStream vs InputStream
 * Input:lee
 * Output:Escribe

 */
public class IOTest {
    public static void main(String[] args) {
        try{
       FileOutputStream fos = new FileOutputStream ("C:\hola.txt");
        fos.write(65);
        fos.close();
        }catch(IOException ioe){
    
        System.out.println(ioe); 
    }
    }
}