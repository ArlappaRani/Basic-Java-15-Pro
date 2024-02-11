package practice;
import java.util.Scanner;
public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the integer value");
		int num=scan.nextInt();
		int result=squareNumber(num);
		System.out.println(result);
	}
	public static int squareNumber(int num)
	{
		int res=num*num;
		return res;
	}
	
		
		
		
		
		

	}


