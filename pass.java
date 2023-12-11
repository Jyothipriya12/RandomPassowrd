package RandomPassword;
import java.util.*;
public class pass {

	public static void main (String[] args) {
	
		String b="abcdefghijklmnopqrstuvwxyz";
		String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digit="0123456789";
		String ch="<>,.?/{}[]=+-*/()&^%$#@!";
		String combo=a+b+digit+ch;
		int len=8;
		char[] password=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++) {
			password[i]=combo.charAt(r.nextInt(combo.length()));
			
		}
		System.out.println("generated password: "+ new String(password));
		

	}

}
