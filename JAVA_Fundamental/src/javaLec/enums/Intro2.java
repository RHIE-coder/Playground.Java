package javaLec.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intro2 {


	static final String ONE = "1";
	static final String TWO = "2";
	static final String THREE = "3";
	static final String FOUR = "4";
	static final String QUIT = "/quit";


	public static void main(String[] args) throws IOException {
		
		
		
		boolean isQuit = false;

		while(true) {
			String msg = new BufferedReader(new InputStreamReader(System.in)).readLine();

			switch(msg) {
			case ONE:
				System.out.println("1? ?? ₯??¨?΅??€.");
				break;
			case TWO:
				System.out.println("2λ₯? ?? ₯??¨?΅??€.");
				break;
			case THREE:
				System.out.println("3? ?? ₯??¨?΅??€.");
				break;
			case FOUR:
				System.out.println("4λ₯? ?? ₯??¨?΅??€.");
				break;
			case QUIT:
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
