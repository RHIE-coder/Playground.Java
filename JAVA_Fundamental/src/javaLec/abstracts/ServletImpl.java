package javaLec.abstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
getServletInfo()
getServletConfig()
init()
service()
destroy()

?΄μ€μ? ?°λ¦¬κ? μ§μ  κ΅¬ν?? λΆ?λΆμ? service()λ°μ ??€...
?μ§?λ§? Servlet ?Έ?°??΄?€λ₯? ?¬?©?  ?λ§λ€ ?λ¨Έμ? λ©μ?λ₯? κ΅¬ν?΄?Ό?? λ²κ±°?¬???΄ ?κΈ΄λ€.
-->μΆμ?΄??€
 */

public class ServletImpl implements Servlet{

	@Override
	public String getServletConfig() {
		return "Servlet ?€? ";
	}

	@Override
	public String getServletInfo() {
		return "Servlet ?€?  ? λ³? μΆλ ₯";
	}

	@Override
	public void init() {
		System.out.println("μ΄κΈ°?");
	}

	@Override
	public void service() throws IOException {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("?λ¬΄κ±°? ?? ₯?΄ μ£ΌμΈ?~ μ’λ£??? €λ©? \'/quit\'? ?? ₯??Έ?");
//			Scanner sc = new Scanner(System.in);
			String msg = keyboard.readLine();
			if(msg.equals("/quit")) {
				break;
			}
			System.out.println(msg);
		}
	}

	@Override
	public void destroy() {
		System.out.println("μ’λ£");
	}
	
	public static void main(String[] args) throws IOException {
		ServletImpl useServlet = new ServletImpl();
		useServlet.init();
		useServlet.service();
		useServlet.destroy();
	}
}
