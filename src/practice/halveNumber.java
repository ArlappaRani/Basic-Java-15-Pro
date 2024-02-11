package practice;
import java.util.Scanner;
public class halveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount");
		double num=scan.nextDouble();
		double result=halveTheNumber(num);
		System.out.println(result);
	}
	public static double halveTheNumber(double num)
	{
		return (num/2);
	}
	

	}


