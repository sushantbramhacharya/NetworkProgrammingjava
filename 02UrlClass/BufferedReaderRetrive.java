import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BufferedReaderRetrive{
    public static void main(String[] args)  throws Exception{
        
        @SuppressWarnings("deprecation")
        URL url = new URL("https://github.com/sushantbramhacharya");
        URLConnection uconn=url.openConnection();

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(uconn.getInputStream()));
        String line,content="";
        while ((line=bufferedReader.readLine())!=null) {
            content+=line+"\n";
        }
        System.out.println(content);
    }
}
