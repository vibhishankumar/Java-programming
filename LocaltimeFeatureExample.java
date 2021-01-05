package learnigstart;
import java.util.*;
import java.time.*;
public class LocaltimeFeatureExample {
	public static void localt(Object o)
	{
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate method 
      LocalDate d=LocalDate.now();localt(d);
      LocalDate hiredate=LocalDate.of(2020, Month.DECEMBER, 24);localt(hiredate);
      LocalDate fromnow=d.plusWeeks(1);localt(fromnow);
      d=d.minusWeeks(1);localt(d);
      System.out.println(hiredate.isBefore(fromnow));
      //local time method 
      LocalTime t=LocalTime.now();localt(t);
      LocalTime hiretime=LocalTime.of(17, 0);localt(hiretime);
      t=t.plusSeconds(45);localt(t);
      t=t.minusHours(2);localt(t);
      //Local Date time method
      LocalDateTime dt=LocalDateTime.now();localt(dt);
      LocalDateTime dthire=LocalDateTime.of(hiredate, hiretime);localt(dthire);
      //another feature as period
      Period p=Period.of(3, 1, 5);localt(p);
      hiredate=hiredate.minus(p);localt(hiredate);
      Period df=Period.between(hiredate, d);localt(df);
	}

}
