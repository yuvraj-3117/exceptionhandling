package EXCEPTIONHANDLING;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MULTIPLECATCHBLOCKS {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50	};
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter position of elemnt");
		int a = sc.nextInt();
		try {
			System.out.println(arr[a]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException  exe) //genric catch block
		{
			System.out.println(exe);//yeah hme msg ded ga kon 
		
			
		} 
		catch(InputMismatchException exe )//hmne integer value dalna he or humne string value dal di toh missmatch exception aayga 
		{
			System.out.println(exe);
		}
		System.out.println("hello");

	}

}
