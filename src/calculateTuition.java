import java.util.Scanner;

public class calculateTuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tuitionTot = 0;
		System.out.println("What is the cost of tuition for your current 2014-2015 school year?");
		double tuitionYrly = input.nextDouble();
		tuitionTot += tuitionYrly;
		for (int year=2015; year<=2017; year++) {
			System.out.print("What is the percentage increase in tuition (%) for the " + year + "-" + (year+1) + " school year?");
			double incr = input.nextDouble() / 100.0;
			tuitionYrly += tuitionYrly*incr;
			tuitionTot += tuitionYrly;
		}
		System.out.printf("The total cost of tuition to complete your four-year degree is $%.2f.", tuitionTot);
	}
}
