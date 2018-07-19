package mainConsoleApplication;

import Encyptor.Encryptor;

public class PersistedFile {
	
	private final String _path;
	private final String _contents;
	private final Encryptor _encryptor;
	
	public PersistedFile(String path, String contents, Encryptor encryptor) {
		_path = path;
		_contents = contents;
		_encryptor = encryptor;
	}
	
	public void persist() {
		_encryptor.writeToDisk(_contents, _path);
	}
}
