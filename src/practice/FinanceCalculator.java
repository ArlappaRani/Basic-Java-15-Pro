package practice;
import java.util.Scanner;
public class FinanceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double principal=scan.nextDouble();
		System.out.println("Enter the rate of interest");
		double rate=scan.nextDouble();
		System.out.println("Enter the time in years");
		double time=scan.nextDouble();
		double simpleInterest=calculateSimpleInterest(principal,rate,time);
		System.out.println(simpleInterest);
	}
	public static double calculateSimpleInterest(double principal,double rate,double time)
	{
		return (principal*rate*time);
	}
	
		
		

	}


