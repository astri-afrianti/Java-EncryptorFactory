package Encyptor;

import EncryptionAlgorithm.*;

public class Sha256Encryptor extends Encryptor{
	
	@Override
	public IEncryptionAlgorithm getEncryptionAlgorithm() {
		return new Sha256EncryptionAlgorithm();
	}
}
