package days08;

import java.util.Random;
import java.util.SortedMap;
import java.util.SortedSet;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 12. - 오후 4:16:59
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		new Random().ints(1, 46).distinct().limit(6)
		  .sorted().mapToObj(i -> i+",").forEach(System.out::print);
		
	}
}
 


