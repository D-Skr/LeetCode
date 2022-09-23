package code_challenges;

import java.time.LocalDate;
import java.time.ZoneId;

public class Q6DaysFromNow {
	// calculate 100 days from now
	static LocalDate calcHundredDaysFromNow(LocalDate today) {
//		Period hundredDays = Period.ofDays(100);
//		return today.plus(hundredDays);
		return today.plusDays(100);
	}
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("100 days from now is: " +
				calcHundredDaysFromNow(today));
	}

}
