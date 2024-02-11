package practice;
import java.util.Scanner;
public class calculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sem1 results");
		int sem1=scan.nextInt();
		System.out.println("Enter the sem2 results");
		int sem2=scan.nextInt();
		System.out.println("Enter the sem3 results");
		int sem3=scan.nextInt();
		System.out.println("Enter the sem4 results");
		int sem4=scan.nextInt();
		System.out.println("Enter the sem5 results");
		int sem5=scan.nextInt();
		System.out.println("Enter the sem6 results");
		int sem6=scan.nextInt();
		System.out.println("Enter the sem7 results");
		int sem7=scan.nextInt();
		System.out.println("Enter the sem8 results");
		int sem8=scan.nextInt();
		double Average=(int)calculateAverages(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		System.out.println(Average);
	}
	public static double calculateAverages(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7,int sem8)
	{
		
		double res=(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		return res;
	}



	}


