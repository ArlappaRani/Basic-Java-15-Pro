package practice;
import java.util.Scanner;
public class Stringjoiner {
	public static void main(String[]args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the first string value");
	 String str1=scan.nextLine();
	 System.out.println("Enter the second string value");
	 String str2=scan.nextLine();
	  String res1=jionStrings(str1,str2);
	  System.out.println(res1);
	}
	public static String jionStrings(String str1,String str2)
	{
	String res=str1+str2;
	return res;
	}

}
