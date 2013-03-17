package x3.client.smeapi;

public interface SMEConnectionFactory {

	SMEConnection createConnection(String smsId, String smsPwd);

}
