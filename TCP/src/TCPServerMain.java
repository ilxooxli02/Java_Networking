import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPServerMain {

    public static void main(String[] args) throws IOException {
        System.out.println("TCP Server standby...");
        ServerSocket serverSocket = new ServerSocket(1019);
        Socket socket;

        while(true){
        //make socket (accept)

        socket = serverSocket.accept();

            //make reader
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //read
            String message = reader.readLine();

            //print message
            System.out.println(socket.getInetAddress()+"> "+message);
            if(message.equalsIgnoreCase("BYE")) break;
        }
    }
}
