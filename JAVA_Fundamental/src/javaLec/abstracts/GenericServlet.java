package javaLec.abstracts;

public abstract class GenericServlet implements Servlet {

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
	public void destroy() {
		System.out.println("μ’λ£");
	}
	
}
