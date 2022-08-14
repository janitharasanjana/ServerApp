package lk.ijse;

import java.io.*;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args){
        final int PORT = 8001;
        try {
            Socket socket = new Socket("localhost", PORT);

       /* System.out.println();
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream()); // we can use this some one or thing to print
        printWriter.println("hello server,kohomada oyata? ");
        printWriter.flush(); */

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());  // yawana dewal yawanna
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());  // ena data ganna

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String message = "" , reply = "" ;

            while (!message.equals("finish")){
                reply = bufferedReader.readLine();
                dataOutputStream.writeUTF(reply);
                message=dataInputStream.readUTF();
                System.out.println(message);

                dataOutputStream.flush();
            }

            dataInputStream.close();
            dataOutputStream.close();
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
