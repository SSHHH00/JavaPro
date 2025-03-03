package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 26. - 오후 4:24:27
 * @subject
 * @content		getProperty?
 */
public class Ex09_05 {

	public static void main(String[] args) {

		String dir = System.getProperty("user.dir");
		System.out.println(dir);

		String fileName = ".\\src\\days16\\16일차복습_홍길동.txt";
		String line = null;
		int lineNumber = 1;

		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader)) {

			while ( (line = br.readLine() )!= null) {
				System.out.printf("%d : %s\n", lineNumber++,line);
			} //while

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {}

		System.out.println("end");
	}//main

}
