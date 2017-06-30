package javaadvanced.Poo.Jueves;

public class MultiR {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task one");
            }

        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task two");
            }

        };

        Thread T1 = new Thread(r1);
        Thread T2 = new Thread(r2);

        T1.start();
        T2.start();

    }
}
