package Encyptor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import EncryptionAlgorithm.*;

public abstract class Encryptor {
	public void writeToDisk(String plainText, String fileName) {
		IEncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
		String cyperText = encryptionAlgorithm.encrypt(plainText);
		
		try(FileOutputStream outputStream = new FileOutputStream(fileName)) {
			outputStream.write(cyperText.getBytes());
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found, please spesify correct path");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract IEncryptionAlgorithm getEncryptionAlgorithm();
}
