import java.util.Scanner;
import java.lang.Math;

class loancalcr
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	double interest_rate,loan_period,loan_amount,total_payment,monthly_payment,tmp;
	System.out.print("Enter the loan amount: ");
	loan_amount=sc.nextDouble();
	System.out.print("Enter the annual interest rate: ");
	interest_rate=sc.nextDouble();
	System.out.print("Enter the loan period: ");
	loan_period=sc.nextDouble();
	interest_rate=interest_rate/(1200.0);
	loan_period=loan_period*12.0;
	tmp=Math.pow(1+interest_rate,loan_period);
	monthly_payment=(loan_amount*interest_rate*tmp)/(tmp-1);
	total_payment=monthly_payment*loan_period;
	System.out.println("Monthly Payment: "+monthly_payment);
	System.out.println("Total Payment: "+total_payment);   
    }
}