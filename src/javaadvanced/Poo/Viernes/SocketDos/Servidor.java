package javaadvanced.Poo.Viernes.SocketDos;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataInputStream dos = new DataInputStream(s.getInputStream());
        BufferedInputStream br = new BufferedInputStream((s.getInputStream()));
        InputStreamReader dis = new InputStreamReader(s.getOutputStream(System.in));
        
        
        String strCliente = "", strServidor = "";
        while (!strCliente.equals("stop")) {
            strCliente = br.readLine();
            System.out.println("el cliente dice " + strCliente);
            strServidor = br.readLine();
            dos.writeUTF(strServidor);

            dos.close();
            dis.close();
            s.close();
            ss.close();

        }
    }
}
