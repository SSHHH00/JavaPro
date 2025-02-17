package home_day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("ㄱㄱ:");
		int fo = sc.nextInt();
		for (int i = 1; i <= fo; i++) {
			for (int j = 1; j <= 9-i; j++) {
				System.out.print("_");
			} //for
			System.out.println("@");
		} //for
		
		
	}

}
