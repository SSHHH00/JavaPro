package zhome;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 13. - 오전 10:14:50
 * @subject
 * @content
 */
public class 낙서 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//830412-[2]700001
		String inputD = sc.nextLine();

		LocalDate today = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyymmdd");
		System.out.println(formatter);
		
		Date d = new Date();
		int currMD = (d.getMonth()+1)*100 + d.getDate();
		System.out.println(currMD);

	}

}



