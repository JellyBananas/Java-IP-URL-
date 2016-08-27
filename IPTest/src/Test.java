import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Dn on 2016/8/26.
 */
public class Test {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}
