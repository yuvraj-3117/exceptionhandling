package EXCEPTIONHANDLING;
import java.util.Scanner;

public class exceptiohandling {//handle runtime erroirs ek io ,classnotfound exception

	public static void main(String[] args) {
		
	int [] arr= {10,20,30,40,50	};
	Scanner sc = new Scanner (System.in);
	
	System.out.println("enter position of elemnt");
	int a = sc.nextInt();
	try {
		System.out.println(arr[a]);
		
		
	}
	catch(ArrayIndexOutOfBoundsException  exe) 
	{
		System.out.println(exe);
	
		
	}
	System.out.println("hello");
	
	}
}