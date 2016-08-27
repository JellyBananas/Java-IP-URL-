import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Dn on 2016/8/26.
 */
public class Url {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String put = null;
            while ((put=bufferedReader.readLine())!=null){
                System.out.println(put);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
