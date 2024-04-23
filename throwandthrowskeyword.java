package EXCEPTIONHANDLING;


//throw use to create exception object and throw excicipltly
//thow se hum exception ko hnadle nahi krte hum excicipltiy khud se throw kr dete he
//throws use to delcear exception and bypass expection to caller
public class throwandthrowskeyword {

	void div(int a, int b) throws ArithmeticException// exception bypas caller main mtd kaa caller jvm he(main mtd call
														// kr rha div ko so handle by main mtd)

	{
		if (b == 0) {

			throw new ArithmeticException(); // exception aaya he div ke ander toh hum try or catch se yah trows se
												// handle kr lenge
		}
		
		else {
			int c = a / b;
			System.out.println(c);
		}

	}

	public static void main(String[] args) throws ArithmeticException {

		throwandthrowskeyword s = new throwandthrowskeyword();
		s.div(12, 0);

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * throwkeyword s = new throwkeyword();
	 * 
	 * try{ s.div(12, 0); } catch(Exception e){
	 * System.out.println("the value of b is zero")
	 * 
	 * }
	 * 
	 * }
	 */

}
