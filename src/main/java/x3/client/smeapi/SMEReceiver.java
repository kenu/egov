package x3.client.smeapi;


public interface SMEReceiver {

	void setListener(SMEListener egovSmsBasicReceiver);

	void close() throws SMEException;

}
