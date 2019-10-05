package tmp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * Period : ? μ§? - ? μ§?
 * Duration : ?κ°? - ?κ°?
 * 
 * Durationκ³? Period? TemporalAmount ?Έ?°??΄?€λ₯? κ΅¬ν???
 */
public class PeriodDuration {
	
	public static void main(String[] args) {
		//? ? μ§μ μ°¨μ΄
		LocalDateTime datetime = LocalDateTime.now();
		
		System.out.println("κΈ°μ? : " + datetime);
		
		LocalDate comparedDate = LocalDate.of(2018, 8, 8);
		Period period = Period.between(comparedDate, datetime.toLocalDate());
		System.out.println(comparedDate + "?? λΉκ΅ --> " + period);
		
		LocalTime comparedTime = LocalTime.of(5, 10, 30);
		Duration duration =Duration.between(comparedTime, datetime.toLocalTime());
		System.out.println(comparedTime + "κ³? λΉκ΅ --> " + duration);
	
		//get? ?΅?΄ ?Ή?  κ°μ ?»? ? ??€. ex) ChronoUnit.YEARS
		
		/*java.time?¨?€μ§? κ΄?? ¨ ??
		 * (1) temporalκ³? chrono? ?λ―Έκ? λͺ¨λ ?κ°?(time)?Έ?°?, time???  κ΅³μ΄ ?΄?° ?΄? €?΄ ?©?΄λ₯? ?΄ ?΄? ?
		 * '?λΆμ΄'? ?κ°κ³Ό '???Ό?λΆμ΄'? ?κ°μ κ΅¬λΆ?κΈ? ??΄??΄?€.
		 * 
		 * (2) TemporalUnit : ? μ§μ? ?κ°μ ?¨?λ₯? ? ??΄ ??? ?Έ?°??΄?€ --> ChronoUnit κ΅¬ν?΄??€
		 * 
		 * (3) TemporalField : ?, ?, ?Ό ?± ? μ§μ? ?κ°μ ??λ₯? ? ??΄ ??? ?Έ?°??΄?€ --> ChronoField κ΅¬ν?΄??€
		 * 
		 */
	}
	
}
