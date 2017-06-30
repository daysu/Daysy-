package javaadvanced.Poo.Jueves.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class IOTest8 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\magia.txt");
        FileInputStream fis2 = new FileInputStream("C:\\magia.txt");
        FileInputStream fos = new FileInputStream("C:\\magia.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);

        int i;
        while ((i = sis.read()) != -1) {
            fos.wait(i);
            System.out.println((char) i);
        }
        close(fis, fis2, fos, sis);
        System.out.println("yaaaa...");
    }

    public static void close(FileInputStream fis, FileInputStream fis2,
            FileInputStream fos, SequenceInputStream sis) throws Exception {
        fis.close();
        fos.close();
        fis2.close();
        sis.close();

    }
}
