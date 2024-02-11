package practice;
import java.util.Scanner;
public class HeightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Height in inches");
		double inches=scan.nextDouble();
		double feet=convertinchesToFeet(inches);
		System.out.println(feet);
	}
	public static double convertinchesToFeet(double inches)
	{
		return (inches/12);
	}
	
	
	

	}


