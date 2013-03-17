package x3.client.smeapi;

public interface SMERequest {

	void setTo(String callTo);

	void setFrom(String callFrom);

	void setCallback(String callBack);

	void setCallbackURL(String callBackUrl);

	void setText(String text);

	void setMessageId(String messageId);

}
