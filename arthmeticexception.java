package EXCEPTIONHANDLING;

public class arthmeticexception {

	public static void main(String[] args) {
		
		int a= 10; int b=0; int c;
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println("main method ended");
	}

}
