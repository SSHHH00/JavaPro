package days13;

/**
 * @author C_Seung_H0
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		/*
		int[][][] m = new int[2][3][4];
		*/
		
		
		//3차월 배열의 초기화
		// 3차원 배열의 초기화
		int[][][] m = {
		    {
		        {1, 2, 3, 4},
		        {5, 6, 7, 8},
		        {9, 10, 11, 12}
		    },
		    {
		        {13, 14, 15, 16},
		        {17, 18, 19, 20},
		        {21, 22, 23, 24}
		    }
		};
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
