package tmp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ? μ§μ? ?κ°μ ????΄? Java ?΄??€λ₯? ??λ³΄μ.
 * 
 * [?­?¬]
 * JDK 1.0 : Date --> JDK 1.1 : Calendar --> JDK 1.8 : java.time
 * 
 *  ??¬ Date? ??λΆ?λΆμ λ©μ?? Deprecated ??. ?¬?©? κΆμ₯?μ§?? ???€.
 *  
 */
public class DateCalendar {
	
	public static void main(String[] args) {
		
		//intro
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		/*SimpleDateFormat ? μ§? ?°?΄?°λ₯? ??? ??λ‘? ?€??κ²? μΆλ ₯?κΈ?
		 * DateFormat μΆμ?΄??€ --> SimpleDateFormat κ΅¬ν?΄??€
		 * G : AD, BC - ?°??
		 * y : 2019 - ??
		 * M : 10 | 10? | OCT - ?
		 * w : 1~53 - ?? λͺ? λ²μ§Έ μ£?
		 * W : 1~5 - ?? λͺ? λ²μ§Έ μ£?
		 * D : 1~366 - ?? λͺ? λ²μ§Έ ?Ό
		 * d : 1~31 - ?? λͺ? λ²μ§Έ ?Ό
		 * E : ?~?Ό - ??Ό
		 * a : ?€? /?€? | AM/PM
		 * H : 0~23 - ?κ°?
		 * h : 1~12 - ?κ°?
		 * m : 0~59 - λΆ?
		 * s : 0~59 - μ΄?
		 * ` : escapeλ¬Έμ(?Ή?λ¬Έμλ₯? ???  ? ?¬?©)
		 * z : Time zone, General time zone
		 * Z : Time zone, RFC 822 time zone
		 */
		
		//κΈ°λ³Έ ?¬?©λ²?
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		System.out.println(result);
		
		//Date ?Έ?€?΄?€λ§? formatλ©μ?? ?¬?©?  ? ??
		Calendar cal = Calendar.getInstance();
		cal.set(2005,9,3);
		Date day = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss  E??Ό");
		System.out.println(sdf.format(day));
		
	}
}
