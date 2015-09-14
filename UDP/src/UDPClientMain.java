import java.io.IOException;
import java.net.*;
import java.util.Scanner;


public class UDPClientMain {

    public static void main(String[] args) throws IOException {
        String message = "";
        Scanner sc = new Scanner(System.in);
        //input message
        System.out.println("보낼 메세지 > ");
        message=sc.nextLine();
        //make packet
        DatagramPacket dp = new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName("localhost"), 1226);

        //make socket
        DatagramSocket ds = new DatagramSocket();

        //send
        ds.send(dp);
    }

}
