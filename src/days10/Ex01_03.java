package days10;

public class Ex01_03 {

	public static void main(String[] args) {
		int n =31;
		int share = n, rest; // 몫, 나머지 변수
		// Ctrl + F
		String hex = "";
		while (share != 0) {
			rest = share % 16;
			share = share / 16;
			switch (rest) {
			} // switch

		} // while

		System.out.printf("%s", hex);
	}

}
