package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {
		//            CharSequence   String
		//"abc".replace("xxx", "yyy");
		//            String 

		// 업캐스팅
		// Regular emp = new SalesMan();
		// E <- R <- S
		// Collection <- List <- ArrayList

		// 업캐스팅
		List list = new ArrayList();

		Vector v = new Vector(list);

		test(new ArrayList());

	} // main

	private static void test(List l) {
	}

}//class













