package javaLec.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Commander{
	String ONE ="1", TWO="2", THREE="3", FOUR="4", QUIT="/quit";
}

public class Intro {
	
	public static void main(String[] args) throws IOException {

		boolean isQuit = false;
		
		while(true) {
			String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();

			switch(msg) {
			case Commander.ONE:
				System.out.println("1? ?? ₯??¨?΅??€.");
				break;
			case Commander.TWO:
				System.out.println("2λ₯? ?? ₯??¨?΅??€.");
				break;
			case Commander.THREE:
				System.out.println("3? ?? ₯??¨?΅??€.");
				break;
			case Commander.FOUR:
				System.out.println("4λ₯? ?? ₯??¨?΅??€.");
				break;
			case Commander.QUIT:
				isQuit = true;
				break;
			default:
				System.out.println("1~4?¬?΄? ?«?λ₯? ?? ₯?΄μ£ΌμΈ?");
				System.out.println("μ’λ£??? €λ©? /quit? ?? ₯??Έ?");
			}
			
			if(isQuit) {
				System.out.println("?λ‘κ·Έ?¨ μ’λ£");
				break;
			}
		}



	}
}
