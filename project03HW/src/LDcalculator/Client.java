package LDcalculator;

import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //Creating socket to connect to Server
        int port = 3000;
        String host = "localhost";
        Socket clientConn = new Socket(host, port);
        
        //Getting outputstream
        OutputStream os = clientConn.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
    
        //Getting input from user using console
        Console cons = System.console();
        String equation = cons.readLine("Please enter an eqution: ");
    
        //Writing output to Server
        dos.writeUTF(equation);
        dos.flush();

        //Getting inputstream
        InputStream is = clientConn.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //Reading answer sent from Server
        int answer = dis.readInt();
        System.out.println(answer);
    }
    
}
