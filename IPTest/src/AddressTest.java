import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Dn on 2016/8/26.
 */
public class AddressTest {
    public InetAddress getClientIP(){
        InetAddress CIP = null;
        try{
            CIP = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
        return CIP;
    }
    public InetAddress getServerIP(){
        InetAddress SIP = null;
        try{
            SIP = InetAddress.getByName("www.baidu.com");
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
        return SIP;
    }
}
