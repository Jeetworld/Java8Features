package Java8Features.Lambda;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(LocalDate.now().minusDays(1));
		
		//1.
		Predicate<LocalDate> isYesterdaysDate = dat -> dat.equals(LocalDate.now().minusDays(1));
		System.out.println("The given date is yesterday's date or not : " + 
		isYesterdaysDate.test(LocalDate.parse("2023-05-01")));
		
		//2.
		Supplier<LocalDate> supp = ()-> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("The next thursday date will be: " +supp.get());
		
		//3.
		Supplier<LocalTime> supp1 = ()-> LocalTime.now(ZoneId.of("US/Eastern"));
		System.out.println("The current time in EST zone is : " +supp1.get());
		LocalTime time = LocalTime.now();
		ZoneId zone = ZoneId.systemDefault();
		
		System.out.println(zone);
		System.out.println(time);
		System.out.println(date.getDayOfMonth()+ "/" + date.getMonthValue() + "/" + date.getYear());
		
		/*
		 * period
		 */
		
		LocalDate birthday = LocalDate.of(1994, 10, 10);
		Period period = Period.between(date, birthday);
		
		System.out.printf("My age is %d years, %d months, %d days old.",
				period.getYears(), period.getMonths(),period.getDays());
	}

}
