package EncryptionAlgorithm;

import org.apache.commons.codec.digest.*;

public class Sha256EncryptionAlgorithm implements IEncryptionAlgorithm{
	
	@Override
	public String encrypt(String plainText) {
		return DigestUtils.sha256Hex(plainText);
	}
}
