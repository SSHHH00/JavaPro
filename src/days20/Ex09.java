package days20;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {

	public static void main(String[] args) {
		// 1. Calendar -> Date 변환
		Calendar c = Calendar.getInstance();
		// [ 2 ]
		Date d = c.getTime();
		// 2. Date -> Calendar 변환 / Calendar setTime , getTime
		c.setTime(d);
//		c.getTime(d);
	}

}
