package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 3:31:31
 * @subject
 * @content			자동 자원 반환 ~ try with ~ resources 문 설명	, 라인번호?
 					각 라인 번호를 붙이자.
 					한 문자씩 처리 X
 					한 라인씩 처리 O ---
 */
public class Ex09_04 {

	public static void main(String[] args) {
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days16\\16일차복습_홍길동.txt";
		String line = null;
		int libeNumber =1;
		
		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {
			
			while ( (line = br.readLine() )!= null) {
				System.out.printf("%d : %s\n", libeNumber++,line);
			} //while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {}
		
		System.out.println("end");
	}//main

}

















