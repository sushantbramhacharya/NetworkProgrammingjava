import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestingReachability {
    public static void main(String[] args) throws UnknownHostException,IOException{
        InetAddress addr=InetAddress.getByName("github.com");
        System.out.println(addr.isReachable(100));
    }
}
