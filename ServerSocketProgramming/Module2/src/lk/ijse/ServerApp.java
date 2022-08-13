package lk.ijse;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        final int PORT = 8001;
        ServerSocket serverSocket  = new ServerSocket(PORT);
        System.out.println("Server is running in port " +PORT);

        Socket localSocket = serverSocket.accept();
        System.out.println("client accepted..!");

        DataOutputStream dataOutputStream = new DataOutputStream(localSocket.getOutputStream());  // yawana dewal yawanna
        DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());  // ena data ganna

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String message = "" , reply = "" ;
    }
}
