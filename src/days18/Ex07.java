package days18;

import java.io.IOException;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 2:41:04
 * @subject
 * @content		시험
 */
public class Ex07 {

	public static void main(String[] args) { 	//throws IOException
		
		//Unhandled exception type IOException
		
//		Exception	
		
//		ArithmeticException
		
//			System.in.read();
		
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		/*
		 	1. "unchecked 예외 "
		 		RuntimeException 및 자식 예외 클래스들은
		 		컴파일러가 예외처리를 확인하지 않는 예외이다.
		 		
		 	2. "checked 예외"
		 	그외 모든 Exception 클래스들은 컴파일러가
		 		예외처리를 확인하는 예외이다.
		 		
		 			예 ) read()	IOExeption 발생시킬 수 있다 
		 
		 */
	
	
	}//main

}//class
