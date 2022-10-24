package Bits;

public class CipherExclusiveOR {
	
	String msg;
	String encmsg;
	int key;
	
	String encode(String msg, int key){
		for(int i = 0; i < msg.length(); i++) {
			encmsg += (char)(msg.charAt(i) ^ key);
		}
		return encmsg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
