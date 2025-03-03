package days13;


/**
 * @author C_Seung_H0
 * @date 2025. 2. 21. - 오전 10:18:23
 * @subject
 * @content		가변배열
 */
public class Ex03 {

	public static void main(String[] args) {
		//3반 30명 학생 성적 처리
		//1반 25명, 2반 28명, 3반 20명
		//int [][] m = new int[3][30];
		int [][][] m =new int[3][][];

		dispM(m);
	}
	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("");
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {

				} //for
			} //for
		} //for

	}
}
