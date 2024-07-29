import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpVersionCheck {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr=InetAddress.getByName("192.168.1.1");
        byte[] address=addr.getAddress();
        if(address.length==4)
        {
            System.out.println("Its IPv4 Address");
        }
        else if(address.length==6)
        {
            System.out.println("Its IPv6 Address");
        }
    }
}
