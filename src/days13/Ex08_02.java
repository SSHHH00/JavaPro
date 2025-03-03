package days13;

public class Ex08_02 {

	public static void main(String[] args) {
		//      4행 3열  2차원 배열 m
	      int [][] m = { {1,2,3}, 
	    		  		 {4,5,6}, 
	    		  		 {7,8,9}, 
	    		  		 {10,11,12} };

	      // 1차원 배열 n
	      int [] n = new int[m.length * m[0].length];
	      
	      // 2차원 배열 m 을  1차원 배열 n으로 변환시켜서 배열 n을 출력.
	      for (int i = 0; i < n.length; i++) {
	            n[i] = m[i / m[0].length][i % m[0].length];
		} //for
	      System.out.println("1차원 배열 : ");
	      for (int num : n) {
			System.out.println(num + " ");
		}
	}

}
