package datatype;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//user input
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter number");
		num =sc.nextInt();
		if (num%2 ==0) {
		System.out.println("this number is even");
		}
		else {
			System.out.println("this number is odd");
		}
		
	}

}
