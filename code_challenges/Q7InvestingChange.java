package code_challenges;

import java.util.Arrays;
import java.util.List;

public class Q7InvestingChange {
	// for every purchase, round up to the next dollar and save the change
	// Example: 5.27 coffee, invest 0.73
	// Count average and total investments
	
	static double calcAvgChangeInvested(List<Double> purchases) {
		return purchases.stream().mapToDouble(x -> Math.ceil(x) - x)
				.average().orElse(0);
	}
	static double calcTotalChangeInvested(List<Double> purchases) {
//		v.1
//		double sum = 0;
//		for(Double purchase : purchases) {
//			sum += Math.ceil(purchase) - purchase;
//		}
//		return sum;
		
//		v.2
		return purchases.stream().mapToDouble(x -> Math.ceil(x) - x)
				.sum();
	}
	public static void main(String[] args) {
		List<Double> purchases = Arrays.asList(12.38, 38.29, 5.27, 3.21);
		System.out.println("Average investment: " + calcAvgChangeInvested(purchases));
		System.out.println("Total investments: " + calcTotalChangeInvested(purchases));
	}

}
