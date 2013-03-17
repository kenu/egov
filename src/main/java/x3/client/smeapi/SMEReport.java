package x3.client.smeapi;

public interface SMEReport {

	boolean isConnected();

	String getMessageId();

	int getResult();

	String getDeliverTime();

	String getDestination();

}
