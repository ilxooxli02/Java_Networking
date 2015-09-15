import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Mirim on 2015-09-14.
 */
public class UDPServerMain {

    public static void main(String[] args) throws IOException {
        //make socket
        DatagramSocket ds = new DatagramSocket(1229);

        System.out.println("UDP Server standby...");

        //print message
        String address;
        String message = "first";

        while(true){
            byte[] data = new byte[1024];

            //make packet
            DatagramPacket dp = new DatagramPacket(data, data.length);
            ds.receive(dp);

            //receive
            address = dp.getAddress().toString();
            message = new String(dp.getData()).trim();

            System.out.println(address+"> "+message);

            if(message.equalsIgnoreCase("BYE")) break;
        }
    }
}
