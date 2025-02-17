package zhome;

import java.util.Random;
import java.util.Scanner;

public class 낙서장 {

	public static void main(String[] args) {
		//"7655-8988-9234-5677"
		String rrn ="7655-8988-9234-5677";
		String[] guBun = rrn.split("-");
		
		Random numCut = new Random();
		
		int cut = numCut.nextInt(4);
		guBun[cut] = "****";
		
		String result =String.join("-", guBun);
		System.out.println(result);
				 
		
	}//main

}//class



