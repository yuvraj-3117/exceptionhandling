package EXCEPTIONHANDLING;

import java.text.NumberFormat;

import javax.crypto.BadPaddingException;

public class numbrformatingxception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";//string value dalenge toh numberformatting exception aayga
		try {
			int a  = Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException exe) {
			System.out.println(exe);
			System.out.println("String cannot be converted into integer");
			
		}
		System.out.println("hello");

	}

}
