package EncryptionAlgorithm;

import org.apache.commons.codec.digest.*;

public class Sha512EncryptionAlgorithm implements IEncryptionAlgorithm{
	
	@Override
	public String encrypt(String plainText) {
		return DigestUtils.sha512Hex(plainText);
	}
}
