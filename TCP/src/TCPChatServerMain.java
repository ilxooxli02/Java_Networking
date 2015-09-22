import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1116);
        Socket socket;

        //make Socket(accept)
        socket = ss.accept();

        //make Sender
        Sender sender = new Sender(socket);
        sender.start();

        //make Receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();
    }
}
