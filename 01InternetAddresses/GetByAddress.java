import java.net.*;

public class GetByAddress {
    public static void main(String[] args) throws UnknownHostException {
        try{
            byte[] ipAddress={(byte)105,(byte)22,(byte)223,(byte)56};
            //typecast to byte
            Inet4Address addr=(Inet4Address) InetAddress.getByAddress(ipAddress);
            //Need to type cast to Inet4Address
            System.out.println(addr.getHostName());
        }catch(Exception exp)
        {
            System.err.println(exp.getMessage());
        }

    }
}
