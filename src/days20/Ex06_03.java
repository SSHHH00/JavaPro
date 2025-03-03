package days20;

import java.util.Date;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 28. - 오후 2:13:35
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {

		Date startDate = new Date(2025-1900,2,3,9,0,0);
		System.out.println(startDate.toLocaleString());
		
		Date endDate = new Date(2025-1900,8-1,8,18,0,0);
		System.out.println(endDate.toLocaleString());
		System.out.println(endDate.getTime());
		
		// 수료일 - 개강일 = 
		System.out.println(endDate.getTime() - startDate.getTime());
		
		long time = 1754643600000L;
		Date d = new Date(time);
		System.out.println(d.toLocaleString());
		
		
		
		
		
		
	}//m

}//c
