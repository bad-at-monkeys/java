package hackerRank;

import java.util.Calendar;
import java.util.Locale;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateAndTime {
	
	// using the Calendar package
	/**
	 * We instantiate a Calendar object use set() with the params as input.
	 * 
	 * We declare a new String variable that will store the return value.
	 * 
	 * We call getDisplayName() on cal
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month-1, day);
		String longDay = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.getDefault()).toUpperCase();
		
		return longDay;	
	}
	
	public static String findMonth(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);    // as ints
		String longMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		
		return longMonth;
	}
	
	
	// using LocalDate
	/**
	 * LocalDate returns the date as 2012-04-12.
	 * 
	 * DayOfWeek gets the day of the week from LocalDate param,
	 * returning an ENUM value (MONDAY,TUESDAY,WED...).
	 * 
	 * DayOfWeek is called on toString() to convert the enum to a String.
	 * NOTE: name() can be used in place of toString(), to return the EXACT
	 * representation of the enum.
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static String longDay(int month, int day, int year) {
		return DayOfWeek.from(LocalDate.of(year, month, day)).toString();
	}
	
	
	// using Calendar and DateFormat
	public static String dayToString(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1,day);
		
		DateFormat df = new SimpleDateFormat("EEEE");
		
		return df.format(cal.getTime()).toUpperCase();
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println();
		
		System.out.println(findDay(4,12,2012));
		System.out.println(findMonth(4,12,2012));
		
		System.out.println();
		
		System.out.println(longDay(4,12,2012));
		System.out.println(LocalDate.of(2012,04,12));
		
		Calendar c = Calendar.getInstance();
		c.set(2012, 5-1, 12);
		System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault()));
	}

}
