import java.net.*;

public class InetAddressDemo{
    public static void main(String[] args) {
        try{

            InetAddress addr=InetAddress.getByName("github.com");
            //dont give http can cause No Host Found
            System.out.println(addr);
            //Gives addr in github.com/20.205.243.166
            System.out.println(addr.getHostAddress());
            //in string format
            //20.205.243.166
            System.out.println(addr.getCanonicalHostName());
            //stricter
            //20.205.243.166
            System.out.println(addr.getHostName());
            //github.com
            System.out.println(addr.getAddress());
            //in byte format
            //[B@682a0b20

        }
        catch(UnknownHostException err)
        {
            System.err.println(err.getMessage());
        }

    }
}