import java.io.InputStream;
import java.net.URL;

public class OpenStreamRetrive {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
        URL url = new URL("https://github.com/sushantbramhacharya");
        InputStream is=url.openStream();

        int c;
        while ((c=is.read())!=-1) {
            System.out.write(c);
        }

    }
}
