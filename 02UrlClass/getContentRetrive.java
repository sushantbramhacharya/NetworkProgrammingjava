import java.net.URL;

public class getContentRetrive {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("deprecation")
        URL url = new URL("https://github.com/sushantbramhacharya");
        Object o=url.getContent();
        System.out.println(o.getClass().getName());
    }
}
