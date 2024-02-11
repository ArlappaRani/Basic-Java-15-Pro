package practice;
import java.util.Scanner;
public class CubeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int result=cubeNumber(num);
		System.out.println(result);
	}
	public static int cubeNumber(int num)
	{
	int res=num*num*num;
	return res;
		
	}
	

	}


