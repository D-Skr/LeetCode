package code_challenges;

import java.util.Scanner;

public class Q4CalculateWaterBill {
	// Calculate Amount Owed for a Water Bill
	// Minimum charge of 18.84 for 1,496 gallons (two CCFs)
	// One CCF equals 748 gallons
	// Use more than two CCFs, charged 3.90 per additional
	// Use 1,800 gallons of water, charged 18.84 plus 3.90 for the extra volume
	
	public static double calcWaterBill(double gallonsUsage) {
		double bill = 18.84;
		double ccf = Math.ceil(gallonsUsage/748);
		if(ccf > 2) bill = bill + 3.90*(ccf-2);
		return bill;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many gallons of water did you use this month?");
		double usage = sc.nextDouble();
		System.out.println("Your water bill is " + calcWaterBill(usage));
		sc.close();
	}

}
