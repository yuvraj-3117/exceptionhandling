package EXCEPTIONHANDLING;

import java.rmi.AccessException;

public class trycatchfinlly {

	public static void main(String[] args) {
		 try {
			 System.out.println("heloo"); //stment1
			 int a = 20, b=0,c;
			 c= a/b;
			 System.out.println(c);//stmt2
			 System.out.println("hiii");//stm3
		 }
		 catch(ArithmeticException exc)
		 {
			 System.out.println("can,t didve by zero");
		 }
	finally {
		System.out.println("subscride");
	}
		 System.out.println("main mtd endeded");
		 

	}

}
