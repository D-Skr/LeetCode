package Bits;

public class CipherExclusiveOR {
	
	static String msg = "Привет! Пук.";
	static String encmsg = "";
	static String decmsg = "";
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
		CipherExclusiveOR ceo = new CipherExclusiveOR();
		System.out.println(ceo.msg);
		System.out.println(ceo.encode(msg, 123456789));
		System.out.println(ceo.decode(encmsg, 123456789));


	}

}
