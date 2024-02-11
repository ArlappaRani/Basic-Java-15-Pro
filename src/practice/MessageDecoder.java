package practice;
import java.util.Scanner;
public class MessageDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character value");
		char ch=scan.next().charAt(0);
		int result=decodeCharacter(ch);
		System.out.println(result);
	}
	public static int decodeCharacter(char ch)
	{
		int res=ch;
		return res;
	}
	

	}


