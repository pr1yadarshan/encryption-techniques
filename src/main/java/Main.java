import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		AES aes = new AES();
		Key key = AES.generateKey(256);
		String encodedKeyString = aes.keyToString(key);
		System.out.println("Base64 Encoded Key String : " + encodedKeyString);
		
		Key originalKey = aes.stringToKey(encodedKeyString);
		
		if(originalKey.equals(key))
			System.out.println(true);
		else
			System.out.println(false);
	}
}
