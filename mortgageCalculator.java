import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class mortgageCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // User inputs principal
            System.out.print("Principal: ");
            int principal = scanner.nextInt();

            // User inputs annual rate
            System.out.print("Annual Rate: ");
            float annualRate = scanner.nextFloat();

            // User inputs number of years
            System.out.print("Number of years: ");
            int years = scanner.nextInt();

            // Convert annual rate to monthly rate
            float monthlyRate = (annualRate / 100) / 12;

            // Convert years to months by multiplying it by 12
            int n = years * 12;

            // finding the value of the numerator
            float nume = (float) Math.pow((1 + monthlyRate), n);
            float finalNumerator = monthlyRate * nume;

            // finding the value of the denominator
            float deno = (float) Math.pow((1 + monthlyRate), n);
            float finalDenominator = deno - 1;

            // Sum all the formulas together
            float mortgage = principal * (finalNumerator / finalDenominator);

            // String result = NumberFormat.getCurrencyInstance().format(mortgage);
            String result = String.format(
                    "Your principal was $ %d, with an annual rate of %.2f and you will be paying for %d years. %n Your mortgage is $ %.2f",
                    principal,
                    (float) annualRate, years, (float) mortgage);

            System.out.println("Mortgage" + result);
        }
    }
}
