package practice;
import java.util.Scanner;
public class JourneyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the speed ");
		double speed=scan.nextDouble();
		System.out.println("Enter the time");
		double time=scan.nextDouble();
		double distance=calculateDistance(speed,time);
		System.out.println(distance);
	}
	public static double calculateDistance(double speed,double time)
	{
		double res=speed*time;
		return res;
	}
		

	}


