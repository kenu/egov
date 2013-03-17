package com.gpki;

public class gpkiapi_jni {

	public static final String API_OPT_RSA_ENC_V20 = null;
	public static final String SYM_ALG_SEED_CBC = null;
	public static final String MEDIA_TYPE_FILE_PATH = null;
	public static final String DATA_TYPE_OTHER = null;
	public String sDetailErrorString;
	public byte[] baReturnArray;
	public byte[] baData;

	public void API_Init(String string) {
		// TODO Auto-generated method stub
		
	}

	public int API_SetOption(String apiOptRsaEncV20) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int CMS_MakeEnvelopedData(byte[] cert, byte[] message,
			String symAlgSeedCbc) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void API_Finish() {
		// TODO Auto-generated method stub
		
	}

	public int STORAGE_ReadPriKey(String mediaTypeFilePath,
			String keyForEnvFile, String pinForEnv, String dataTypeOther) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int STORAGE_ReadCert(String mediaTypeFilePath,
			String certForEnvFile, String dataTypeOther) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int CMS_ProcessEnvelopedData(byte[] certificate, byte[] baPriKey,
			byte[] data) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int CMS_MakeSignedData(byte[] certificate, byte[] key,
			byte[] message, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int CMS_ProcessSignedData(byte[] signedData) {
		// TODO Auto-generated method stub
		return 0;
	}

}
