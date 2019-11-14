package novdemo;
import java.util.Scanner;

public class FriendsInterest
{
public static void main(String [] args)
{
	Scanner sc =new Scanner(System.in);
	
	double a =sc.nextDouble();
	int b=sc.nextInt();
	int c=sc.nextInt();
	double n;
	n=0.0;
	int count=1;
	while(n<=c)
	{
	n=a+((a*b)/100);
	if(n>=c)
	 System.out.println(count);
	count++;
	a=n;
	
}
}
}
	
		



	
	





