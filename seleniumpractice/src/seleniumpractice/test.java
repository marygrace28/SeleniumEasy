package seleniumpractice;
import java.util.Base64;
public class test {

	


	public static void main(String[] args) {

	String encrptData= "fsociety";
			
	byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
			
	System.out.println("encodedBytes --------------->" + new String(encodedBytes));

	}
	}


