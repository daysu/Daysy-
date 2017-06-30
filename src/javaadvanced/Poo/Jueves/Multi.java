/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Poo.Jueves;
//Solved by Annonymous class that
//MultiTask = MultiThread
//Thread t1 = new Thread(){
//Thread tipo de dato de objeto
//t1: nombre del objeto
//=:operador de asignacion
//new:apunta a una nueva insatncia del objeto
//Thread(): constructor por defaut/omision
//{inicializo clase anonima
public class Multi  {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
        public void run(){
        
            System.out.println("Tarea uno");
        }
   };
         Thread t2 = new Thread(){
        public void run(){
        
            System.out.println("Tarea dos");
    
  }};
         t1.start();
         t2.start();
                 }
}


