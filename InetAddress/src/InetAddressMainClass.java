import java.net.InetAddress;

public class InetAddressMainClass {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();
            // 내 컴퓨터
            System.out.println("내 컴퓨터");
            // get InetAddress from 127.0.0.1
            // IP 주소
            System.out.println("IP 주소 : " + inet.getHostAddress());
            // 도메인 이름
            System.out.println("도메인 이름 : " + inet.getHostName());

            System.out.println("--------------------------------");
            inet = InetAddress.getByName("www.e-mirim.hs.kr");
            // 미림 홈페이지
            System.out.println("미림 홈페이지");
            // get InetAddress from www.e-mirim.hs.kr
            // IP 주소
            System.out.println("IP 주소 : " + inet.getHostAddress());
            // 도메인 이름
            System.out.println("도메인 이름 : " + inet.getHostName());
        } catch (Exception e) {}
    }
}
