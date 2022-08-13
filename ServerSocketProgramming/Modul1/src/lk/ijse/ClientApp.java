package lk.ijse;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        final int PORT = 8001;
        Socket socket = new Socket("localhost",PORT);
        System.out.println();
    }
}
