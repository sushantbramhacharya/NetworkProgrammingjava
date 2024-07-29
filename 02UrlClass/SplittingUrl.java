import java.net.URL;

public class SplittingUrl {
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("deprecation")
        URL url = new URL("https://lec.edu.np:5050/?gender=male");
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getQuery());
        System.out.println(url.getUserInfo());
        System.out.println(url.getAuthority());
        System.out.println(url.getProtocol());
        System.out.println(url.getPath());
    }
}
