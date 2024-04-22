package EXCEPTIONHANDLING;

public class nullpointerexception {

	public static void main(String[] args) {
	String s =null;
	
	try
	{
		
		System.out.println(s.toUpperCase());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("main endede");

}}
