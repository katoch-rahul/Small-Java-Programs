import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		int a=scan.nextInt();
		System.out.println("Enter 2nd Number ");
		int b=scan.nextInt();
		 
		try
		{
			int c = a/b;
			System.out.println("Division is " + c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter Right Values coz " + e); 
		}
		finally { int sum=a+b; System.out.println("Sum is "+sum);}
		 
	}

}