/**
 * Created by AL on 2015-01-28.
 */
import org.apache.activemq.broker.BrokerService;

public class JMSServer {
    public static void main(String[] args) throws Exception {
        BrokerService brokerService = new BrokerService();
        brokerService.addConnector("tcp://localhost:61616");
        brokerService.start();
    }
}
