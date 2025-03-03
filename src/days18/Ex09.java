package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import days07.days07_Ex03_03;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 3:31:31
 * @subject
 * @content			자동 자원 반환 ~ try with ~ resources 문 설명
 */
public class Ex09 {

	public static void main(String[] args) {
		
//		days
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days16\\16일차복습_홍길동.txt";
		FileReader reader = null;
		int one ;
		try {
			reader = new FileReader(fileName);
//			one = reader.read();
//			System.out.println(one);
			while (( one = reader.read()) != -1){
				System.out.printf("%c",(char)one);
			} //while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
		
		
	}

}

















