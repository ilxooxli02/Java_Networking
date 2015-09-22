import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class Receiver extends Thread {
    Socket socket;
    DataInputStream in;

    Receiver(Socket socket) throws IOException {
        this.socket = socket;
        //make DataInputStream
        in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        //Input message

            String message = null;
        while(in != null) {
            try {
                message = in.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(socket.getInetAddress()+"> "+message);
        }
    }
}
