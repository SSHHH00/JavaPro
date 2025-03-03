package zhome;

import java.io.FileReader;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 27. - 오전 8:28:54
 * @subject
 * @content
 */
public class day0227 {

	public static void main(String[] args) {
		String fileNuber = "\"C:\\Class\\JavaClass\\javaPro\\src\\zhome\\학생명단.txt\"";
		int one;
		try	( FileReader rd = new FileReader(fileNuber) ) {
			while (( one = rd.read() )!= -1) {
				System.out.printf("%s",one);
			} //while
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
