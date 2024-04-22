package EXCEPTIONHANDLING;

public class numberformateexception {

	public static void main(String[] args) {
	String s ="yuvi";
	
	try
	{
		int a = Integer.parseInt(s);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("main tmd ended");
	}

}
