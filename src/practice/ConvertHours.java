package practice;
import java.util.Scanner;
public class ConvertHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		int minutes=scan.nextInt();
		double Hours=convertToHours(minutes);
		System.out.println(Hours);
	}
	public static double convertToHours(double minutes)
	{
		return (minutes/60);
	}

	}


