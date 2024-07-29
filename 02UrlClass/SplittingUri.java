import java.net.URI;

public class SplittingUri{
    public static void main(String[] args) throws Exception{
        URI uri=new URI("https://github.com:40/home.html?gender=male");
        System.out.println(uri.getPath());
        System.out.println(uri.getHost());
        System.out.println(uri.getPort());
        System.out.println(uri.getAuthority());
        System.out.println(uri.getUserInfo());
        System.out.println(uri.getScheme());
        System.out.println(uri.getQuery());
    }
}