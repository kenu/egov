package com.gpki.gpkiapi.cert;

public interface X509Certificate {

	String getSubjectDN();

	String getIssuerDN();

	byte[] getCert();

}
