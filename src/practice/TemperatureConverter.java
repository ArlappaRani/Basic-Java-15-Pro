package practice;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit");
		double fahrenheit=scan.nextDouble();
		double Celcius=convertFahrenheitToCelsius(fahrenheit);
		System.out.println( Celcius);
	}
	public static double convertFahrenheitToCelsius(double fahrenheit)
	{
		double res=(fahrenheit-32)*5/9;
		return res;
		


	}

}
