package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = null;
		Account acc = new Account("Jhon");
		
		try {
			sc = new Scanner(System.in);
			
			System.out.print("a [0, 10]= ");
			int a = sc.nextInt();			
			System.out.print("b [0, 10]= ");
			int b = sc.nextInt();
			
			if(isBeBetweenZeroAndTen(a)) 
				throw new ArithmeticException("This value is not allowed");
			
			if(isBeBetweenZeroAndTen(b)) 
				throw new ArithmeticException("This value is not allowed");
			
			division(a, b);
			System.out.println("Sucess!");
		} catch(ArithmeticException aritExcep) {
			System.err.println("Error: " + aritExcep.getMessage());
		} catch(InputMismatchException imExcep) {
			System.err.println("Error: incompatible input");
		} finally {
			if(sc != null) sc.close();
		}
		
		System.out.println(acc);
		
	}

	private static void division(int a, int b) {
		System.out.println(a/b);
	}
	
	private static boolean isBeBetweenZeroAndTen(int number) {
		if(number < 0 || number > 10) 
			return false;
		
		return true;
	}
	
}
