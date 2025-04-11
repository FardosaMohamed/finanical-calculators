import java.util.Scanner;

public class Calculator2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter Initial Deposit e.g. 1000:");
        double deposit = scanner.nextDouble();

        System.out.println("Enter Interest Rate e.g. 1.75 (in percentage):");
        double interestRate = scanner.nextDouble();


        System.out.println("Enter Number of Years  e.g. 5 (in years):");
        double numOfYears = scanner.nextDouble();


        double endBalance  = deposit * (Math.pow((1 + (interestRate/100/365)), (365* numOfYears)));
        double earnInterest = endBalance - deposit;

        System.out.printf("Your Future Balance: %.2f\n", endBalance);
        System.out.printf("Your Earned Interest: %.2f\n", earnInterest);


   }
}
