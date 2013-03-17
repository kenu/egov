package x3.client.smeapi;

public interface SMESession {

	SMEReceiver createReceiver();

	void close() throws SMEException;

	SMESender createSender();

	void setReceiverCreated(boolean b);

	SMERequest createRequest();

}
