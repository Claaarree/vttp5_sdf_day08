package LDcalculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        //Creating server
        int port = 3000;
        try (ServerSocket server = new ServerSocket(port)) {
            //Getting client connection
            Socket clientConn = server.accept();
            
            //Getting input from client 
            InputStream is = clientConn.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            //Reading equation from client
            String equation = dis.readUTF();
            int answer = evaluateEquation(equation);


            //Opening outputstream to send answer back to client
            OutputStream os = clientConn.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            //Writing output to client
            dos.writeInt(answer);
            dos.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
    
    public static int evaluateEquation (String equation) {
        String[] equationSplit = equation.split(" ");
        int a = Integer.parseInt(equationSplit[0]);
        int b = Integer.parseInt(equationSplit[2]);
        String operator = equationSplit[1];
        int sum = 0;
        switch (operator) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
            break;
            case "*":
            case "x":
                sum = a * b;
            break;
            case "/":
                sum = a / b;
            break;
          
            default:
                break;
        }
        return sum;
    }
}
