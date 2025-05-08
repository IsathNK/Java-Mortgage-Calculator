import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        System.out.println("Welcome "+name.trim());

        //WELCOME//
        System.out.println("Welcome To Mortgage Calculator By IsathNK \n");

        //Initializing Scanner//
        Scanner input = new Scanner(System.in);

        //Loan Amount Input
        System.out.print("Enter the Loan Amount You Need: ");
        String sloanAmount = input.nextLine();

        //Interest Rate
        System.out.print("Enter the Interest Rate: ");
        String sinterestRate = input.nextLine();

        //Repayment Period
        System.out.print("Enter Repayment Period in Years: ");
        String srepaymentPeriod = input.nextLine();

        //Conversion Of Strings
        double loanAmount = Double.parseDouble(sloanAmount);
        double interestRate = Double.parseDouble(sinterestRate);
        int repaymentPeriod = Integer.parseInt(srepaymentPeriod);

        //Initializing Final Variables
        double monthlyPayment = 0;

        //Calculations
        interestRate = interestRate/100/12;
        repaymentPeriod = repaymentPeriod*12;

        monthlyPayment=loanAmount *(interestRate * Math.pow(1 + interestRate, repaymentPeriod)) /
                (Math.pow(1 + interestRate, repaymentPeriod) - 1);

        //FINAL

        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);


        System.out.println("Your Monthly Payment Is :"+ monthlyPaymentFormatted);
    }
}