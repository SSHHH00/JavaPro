package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 10. - 오후 4:49:57
 * @subject 	String -> char[]변환
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		
		// char name.charAt(int index)
		// 5:01 수업 시작~
		// String -> char[] 변환
		String name = "admin";
		char ch;
		char [] nameArr = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			nameArr[i] = ch;
			System.out.printf("%s -> %d -> '%c'\n", name, i,  ch);
		} // for i

		System.out.println( Arrays.toString(nameArr ));

		// char[] -> String 변환

		/*
	      char ch = name.charAt(0);
	      System.out.printf("%s -> '%c'\n", name, ch);

	      ch = name.charAt(1);
	      System.out.printf("%s -> '%c'\n", name, ch);

	      ch = name.charAt(2);
	      System.out.printf("%s -> '%c'\n", name, ch);

	      ch = name.charAt(3);
	      System.out.printf("%s -> '%c'\n", name, ch);

	      ch = name.charAt(4);
	      System.out.printf("%s -> '%c'\n", name, ch);
		 */





//		Scanner sc = new Scanner(System.in);
//		String name = "admin";
//		//char name.charAt(int index)
//		char ch =name.charAt(0);
//		System.out.printf("%s -> '%c'\n",ch);
//		
//		ch =name.charAt(1);
//		System.out.printf("%s -> '%c'\n",ch);
//		
//	
		
		
		
		// [1]
		/*
		Scanner sc = new Scanner(System.in);
		String name = "admin";
		//char name.charAt(int index)
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			
			System.out.printf("%s -> %d '%c'\n",name,i,ch);
		}System.out.printf(Arrays.toString(name));
		//String 
		*/
		
	      //char[] -> String[] 변환
	      name = new String(nameArr);
	      
	
	
	
	
	
	
	}//main
}


 


