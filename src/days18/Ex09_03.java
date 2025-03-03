package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 3:31:31
 * @subject
 * @content			자동 자원 반환 ~ try with ~ resources 문 설명	, 라인번호?
 					각 라인 번호를 붙이자.
 */
public class Ex09_03 {

	public static void main(String[] args) {
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days16\\16일차복습_홍길동.txt";
		int one ;
		int libeNumber =1;
		
		try (FileReader reader = new FileReader(fileName);) {
			System.out.printf("%d : ",libeNumber++);
			while (( one = reader.read()) != -1){
				System.out.printf("%c",(char)one);
				//^(100|[1-9]?[0-9])$\r\n 개행
				//(char)one =='\n'
				if( one == 10) {
					System.out.printf("%d : ",libeNumber++);
				}
			} //while	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {}
		
		System.out.println("end");
	}//main

}

















