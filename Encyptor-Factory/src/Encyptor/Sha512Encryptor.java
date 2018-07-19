package Encyptor;

import EncryptionAlgorithm.*;

public class Sha512Encryptor extends Encryptor{
	
	@Override
	public IEncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha512EncryptionAlgorithm();
	}
}