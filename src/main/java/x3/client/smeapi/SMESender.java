package x3.client.smeapi;

public interface SMESender {

	SMEResponse send(SMERequest request) throws SMEException;

	void close() throws SMEException;

}
