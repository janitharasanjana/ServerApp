import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFormController {
    private TextArea txtArea;

    private TextField txtMessage;
    ServerSocket serverSocket;
    Socket accept;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;

    public void initialize (){
        new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
        })

    }

    private void sendOnAction(ActionEvent actionEvent) {
    }
}
