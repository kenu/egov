package x3.client.smeapi;

public interface SMEConnection {

	SMESession createSession();

	void start() throws SMEException;

	void close() throws SMEException;

}
