import java.io.InputStream;
import java.net.*;
public class OpenConnectionRetrive {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
        URL url = new URL("https://github.com/sushantbramhacharya");
        URLConnection ucon=url.openConnection();
        InputStream is=ucon.getInputStream();
        
        int c;
        while ((c=is.read())!=-1) {
            System.out.write(c);
        }
    }
}
