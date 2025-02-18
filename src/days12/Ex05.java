package days12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 [ 배열 선언 * int 100 	0~9 임의의 정수 채워넣고 
		 0	11개
		 1	3개
		 2	20개
		 
		 
		 */
		int[] m = new int[100];
		//[1]
		
		/*Random rnd =new Random();
		for (int i = 0; i < m.length; i++) {
			 m[i] = rnd.nextInt(10);
		} */
		
		// [ 2 ] 
		/*
		int [] m = new Random().ints(0,10).limit(100).toArray();
		*/
		
		//	[ 3 ]
	/*	int [] m = new int[100];
		Random rnd =new Random();
		
		m = IntStream.generate(new IntSupplier() {
            @Override
            public int getAsInt() {
                return rnd.nextInt(10); // 0~9 사이의 랜덤 값 생성
            }
        }).limit(100).toArray();

        // 배열 출력
        System.out.println(java.util.Arrays.toString(m));
	*/	
		
		//	[ 4 ]
		
		m = new Random().ints(0,10).limit(100).toArray();
		System.out.println(Arrays.toString(m));
		
		int[] count = new int[10];
		
		for (int i = 0; i < count.length; i++) {
			
		} //for
		
		//	[ 5 ]
		m =  new Random().ints(0,10).limit(100).toArray();
	      System.out.println(Arrays.toString(m));
	      
	      // [2]  100반복처리.
	      int [] countArr = new int[10];
	      for (int i = 0; i < m.length; i++) {
	         countArr[m[i]]++;
	      } // for i
	      System.out.println( Arrays.toString(countArr) );

		
	}

}
