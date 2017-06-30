
package javaadvanced.Poo.Miercoles;


public class TestJoin  extends Thread{
    @Override
    public void run(){
    for(int i=1; i<5; i++){
        
    try{
        Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
    }
    System.out.println("i");
    }
    }
    public static void main(String[] args) {
        TestJoin  t1= new TestJoin ();
        TestJoin  t2= new TestJoin ();
        TestJoin  t3= new TestJoin ();
        try{
       
        Thread.sleep(500);
            boolean i = false;
                System.out.println(i);
            } catch(InterruptedException ie){
                System.out.println(ie);
                
                
                
                t1.start();
                t2.start();
                t1.start();
            }
        
    
    }
}

  
