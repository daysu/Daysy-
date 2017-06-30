package javaadvanced.Poo.Martes;

public class Banco {

    int getTazaDeInteres() {
        return 0;
    }

}

class Bancomer extends Banco {

    @Override
    int getTazaDeInteres() {
        return 8;
    }

    class HSBC extends Banco {

        @Override
        int getTazaDeInteres() {
            return 7;
        }

        class Bancoppel extends Banco {

            @Override
            int getTazaDeInteres() {
                return 9;
            }
        }

        class PruevaBanco {

            
        }

        {
            Bancomer b = new Bancomer();
            HSBC h = new HSBC();
            Bancoppel bc = new Bancoppel();

            System.out.println("Bancomer la taza de intereses:"
                    + b.getTazaDeInteres());
            System.out.println("HSBC la taza de intereses:"
                    + b.getTazaDeInteres());
            System.out.println("Bancoppel la taza de intereses:"
                    + b.getTazaDeInteres());

        }
    }
        public static void main(String[] args) {
            
        }

    }


