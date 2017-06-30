package javaadvanced.Poo.Jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
la clase Java BufferDoutputStream se utiliza 
para almacenar en Bufer un stream de salida.
Internamente utiliza un buffer para almacenar
datos directamente en un Scream.
añade mas eficiencia que escribir datos  demanera directa de un flujo
por lo tanto logra mejor rendimiento
tiene 2 constructores:
BufferdOutputStream(OutputScream OS):
crea un nuevo flujo de salida de almacenamiento en bufer. que se utiliza 
para escribir los datos en el stream especificado.
BufferdOutputStream(OutputScream OS),int si se crea un nuevo 
flujo de salida que sera almacenada en el bufer el cual se utiliza 
para escribir datos en el Stream especifica 
el tamaño del bufer.
Metodos: void write(int b ): escribe el byte  especificado en el Stream 
de salida almacenado en buffer.
void write(byt)

void flus(): Borra el flujo de salida almacenada en el bufer. 
vacia los datos de una secuencia y 
la envia a otro se nesecita si se ha conectado una secuencia con otra
 */
public class IOTest5 {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
        } catch (IOException ioe) {
            BufferedOutputScream bout = new BufferedOutputScream(fos);

            String s = "Hola \ a todos";
            byte[] b = s.getBytes();

            bout.write(b);

            bout.flush();
            bout.close();
            fos.close();
            System.out.println("listo");
        } catch (IOException ioe) 
        }
    }
