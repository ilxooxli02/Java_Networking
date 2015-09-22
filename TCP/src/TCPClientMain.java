import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPClientMain {
    public static void main(String[] args) throws IOException {
        while(true) {
            //input message
            String message = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("보낼 메세지 > ");
            message = sc.nextLine();

            //make socket
            Socket socket = new Socket("localhost", 1019);

            //make writer
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            //write
            writer.println(message);
            if(message.equalsIgnoreCase("BYE")) break;
        }
    }
}
