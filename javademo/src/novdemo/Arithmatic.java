package novdemo;
import java.util.Scanner;
public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a+b)==c)
		{
			System.out.println("Add");
			count++;
		}
		if((a-b)==c)
		{
			System.out.println("Subtract");
			count++;
		}
		if((a*b)==c)
		{
			System.out.println("Multiply");
			count++;
		}
		if((a/b)==c)
		{
			System.out.println("Divide");
			count++;
		}
		if((a%b)==c)
		{
			System.out.println("Modulo");
			count++;
		}
		if(count==0)
			System.out.println("invalid");
			
			
		}
	}


