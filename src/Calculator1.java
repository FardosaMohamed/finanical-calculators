import java.util.Scanner;

public class Calculator1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Principle Loan:");
        double principle = scanner.nextDouble();

        System.out.println("Enter Interest Rate:");
        double interestRate = scanner.nextDouble();
        double monthlyRate = interestRate / 100 / 12;

        System.out.println("Enter Loan Length:");
        double loanLength = scanner.nextDouble();
        double numOfMonthPay = 12 * loanLength;


        double monthlyPayment = principle * (monthlyRate * (Math.pow((1 + monthlyRate), numOfMonthPay))) / (Math.pow((1 + monthlyRate), numOfMonthPay)- 1);
        double totalInterest = (monthlyPayment * numOfMonthPay) - principle;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Interest: %.2f\n", totalInterest);

    }
}