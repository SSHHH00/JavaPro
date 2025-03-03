package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author C_Seung_H0
 *		1차원 배열의 초기화
 *
 *
 */			
public class Ex02 {
	public static void main(String[] args) throws IOException {
		/*
		int [] m = new int[3];
		m[0]=1;
		m[1]=2;
		m[2]=3;
		*/
		//배열 초기화
	//	int [] m =new int[] {1,2,3};
		int [] m = {1,2,3,};
		
		dispM(m);
		
	   }

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d",i,m[i]);
		} //for
		
	}

	} // class 