package Bits;

public class CipherExclusiveOR {
	
	String msg;
	String encmsg;
	String decmsg;
	int key;
	
	String encode(String msg, int key){
		for(int i = 0; i < msg.length(); i++) {
			encmsg += (char)(msg.charAt(i) ^ key);
		}
		return encmsg;
	}
	
	String decode(String msg, int key) {
		return encode(msg, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
