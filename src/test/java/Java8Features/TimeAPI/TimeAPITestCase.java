package Java8Features.TimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TimeAPITestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Write a predicate to check if the given date is yesterday date. 
		Predicate<LocalDate> isYesterdaysDate = dat -> dat.equals(LocalDate.now().minusDays(1));
		System.out.println("The given date is yesterday's date or not : " + 
		isYesterdaysDate.test(LocalDate.parse("2023-05-24")));
		
		//2. Write a Supplier to get Date for next Thursday. 
		Supplier<LocalDate> supp = ()-> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("The next thursday date will be: " +supp.get());
		
		//3. Write a Supplier to get CurrentTime in EST timezone
		Supplier<LocalTime> supp1 = ()-> LocalTime.now(ZoneId.of("US/Eastern"));
		System.out.println("The current time in EST zone is : " +supp1.get());
		
		//4. Write a Function to calculate the age of a person given date of birth. 
		LocalDate date = LocalDate.now();
		LocalDate birthday = LocalDate.of(1994, 10, 10);
		Period period = Period.between(date, birthday);
		System.out.printf("My age is %d years, %d months, %d days old.",
				period.getYears(), period.getMonths(),period.getDays());

	}

}
