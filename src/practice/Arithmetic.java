package practice;
import java.util.Scanner;
public class Arithmetic {
	public static void main(String[]args)
	{
	 Scanner scan=new Scanner(System.in);
	 int num1=scan.nextInt();
	 int num2=scan.nextInt();
	 int re1=subtractNumbers(num1,num2);
	 System.out.println(re1);
	
	 int re2=multiplyNumbers(num1,num2);
	 System.out.println(re2);
	 
	 double re3=divideNumbers(num1,num2);
	 System.out.printf("%.2f%n",re3);
	 
	 int re4=findRemainder(num1,num2);
	 System.out.println(re4);
	}

	public static int subtractNumbers(int num1,int num2)
	{
		int res1=num1-num2;
		return (res1);
	}
	public static int multiplyNumbers(int num1,int num2)
		{
		int res2=num1*num2;
		return (res2);
		}
	public static double divideNumbers(double num1,double num2)
	{
	    double res3=num1/num2; 
	    return (res3);
	}
	public static int findRemainder(int num1,int num2)
	{
	    int res4=num1%num2; 
	    return (res4);
	}
}
