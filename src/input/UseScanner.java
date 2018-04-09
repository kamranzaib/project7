package input;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int inputValue1 = sc.nextInt();
		int inputValue2 = sc.nextInt();
		System.out.println(inputValue1+inputValue2);
		sc.close();
		try {
			if(sc !=null) {
				sc.close();
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
