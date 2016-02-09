import ru.terralink.ws.client.SyncServiceClient;

import java.net.MalformedURLException;
import java.util.Map;

/**
 * Created by Aksndr on 09.02.2016.
 */
public class Test {
    public static void main(String[] args) throws MalformedURLException {

        SyncServiceClient client = new SyncServiceClient();
        client.init("http://aksndr_pc:8088/mockBasicHttpBinding_ISyncService?WSDL");

        Map p = client.syncOutContractData("ssdf","asdads","234123","20160212",null,"123dfsa");

        System.out.print(p);

        p = client.syncOutContractURL("ssdf","asdads",null,"20160212","sadfasdf","123dfsa");
        System.out.print(p);
    }

}
