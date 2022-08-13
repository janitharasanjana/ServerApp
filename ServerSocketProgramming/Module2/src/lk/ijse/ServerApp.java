package lk.ijse;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) throws IOException {
        final int PORT = 8001;
        ServerSocket serverSocket  = new ServerSocket(PORT);
        System.out.println("Server is running in port " +PORT);

        Socket localSocket = serverSocket.accept();
        System.out.println("client accepted..!");

        DataOutputStream dataOutputStream = new DataOutputStream();
    }
}
