package config;

import java.security.MessageDigest;

public class Hash {

	public static String hashPW(String id, String pw) {
		try {
			// 1. Hash알고리즘 SHA-256
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update((pw + id).getBytes());
	        
			byte[] pwdSalt = md.digest();
	        StringBuffer sb = new StringBuffer();
	        for(byte b : pwdSalt) {
	            sb.append(String.format("%02x", b));
	        }
	        String result = sb.toString();
	        return result;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
