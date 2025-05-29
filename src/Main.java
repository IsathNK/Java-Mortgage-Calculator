import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //INITIALIZATION//
        System.out.println("Welcome To Mortgage Calculator By IsathNK \n");
        Scanner input = new Scanner(System.in);

        //INPUTS//
        System.out.print("Enter the Loan Amount You Need: ");
        int loanAmount = input.nextInt();

        System.out.print("Enter the Interest Rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter Repayment Period in Years: ");
        int repaymentPeriod = input.nextInt();

        System.out.println("Your Monthly Installment Amount Is :"+ NumberFormat.getCurrencyInstance().format(calculate(loanAmount,interestRate,repaymentPeriod)));

        balance(repaymentPeriod,loanAmount,interestRate);

    }

    public static void balance(int repaymentPeriod,int loanAmount , double interestRate){

    int n = repaymentPeriod * 12;
    double installment = 0;
    System.out.println("-----REPAYMENT SCHEME-----\n");
        for(int i=0; i<=n ; i++)
    {
        double c = interestRate/100/12;
        installment = loanAmount * ( (Math.pow(1 + c, n) - Math.pow(1 + c, i)) / (Math.pow(1 + c, n) - 1));
        System.out.println("Installment "+i+": "+ NumberFormat.getCurrencyInstance().format((installment)));

    }
    }



    public static double calculate(int loanAmount,
                                   double interestRate,
                                   int repaymentPeriod){
        //Calculations
        interestRate = interestRate/100/12;
        repaymentPeriod = repaymentPeriod*12;

        //Initializing Final Variables
        double monthlyPayment = 0;

        //Calculation
        monthlyPayment=loanAmount *(interestRate * Math.pow(1 + interestRate, repaymentPeriod)) /
                (Math.pow(1 + interestRate, repaymentPeriod) - 1);


        return monthlyPayment;
    }
}