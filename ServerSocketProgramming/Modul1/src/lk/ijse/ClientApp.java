package lk.ijse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        final int PORT = 8001;
        Socket socket = new Socket("localhost",PORT);
        System.out.println();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream()); // we can use this some one or thing to print
        printWriter.println("hello server,kohomada oyata? ");
        printWriter.flush();
    }
}
