package learnigstart;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dateformat {
	public static void display(Object o)
	{
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Local time and date method
		LocalDate dd=LocalDate.now();display(dd);
		//Date and time format FormatStyle contain format as Long ,Medioum and Short
		DateTimeFormatter df=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		display(dd.format(df));
		//format as in medium
		DateTimeFormatter dff=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		display(dd.format(dff));
		//format as in short
		DateTimeFormatter dfs=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		display(dd.format(dfs));
		//format as in full format
		DateTimeFormatter dfsf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		display(dd.format(dfsf));
		//FromatStyle ofPattern includes patterns as you want
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd 'in the year of' yyyy");
		display(dd.format(pattern));
	}

}
