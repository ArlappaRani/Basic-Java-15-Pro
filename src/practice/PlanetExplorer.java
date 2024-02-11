package practice;
import java.util.Scanner;
public class PlanetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a radius of sphere");
		double radius=scan.nextDouble();
		double area=calculateSurfaceArea(radius);
		System.out.println(area);
	}
	public static double calculateSurfaceArea(double radius)
	{
		return (4*3.14*radius*radius);
	}

	}


