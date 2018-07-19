package mainConsoleApplication;

import Encyptor.Sha256Encryptor;

public class MainApp {

	public static void main(String[] args) {
		String toBeEncryptedWords = "Hello, World!";
		System.out.printf("Starting to encrypt \"%s\" on encrypted.txt \n", toBeEncryptedWords);
		PersistedFile file = new PersistedFile("E:\\CDC\\Java Bootcamp2\\encrypted2.txt", toBeEncryptedWords, new Sha256Encryptor());
		file.persist();
		System.out.println("Finish encrypting");
	}

}
