package days12;

import java.util.Arrays;
import java.util.stream.Collectors;


public class Ex02 {

	
	
	
	
	
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(m.length);
		System.out.println(Arrays.toString(m));
		//1. 6을 배열의 제일 뒤에 추가
		m = Arrays.copyOf(m, m.length + 1);
		m[5] = 6;
		System.out.println(Arrays.toString(m));
		
		
		//2. 2가 있는 위치를 찾아서 100을 삽입
	/*	m = Arrays.copyOf(m, m.length +1);
		m[2] = 100;
		System.out.println(Arrays.toString(m));
	*/
		//2. 배열의 단점 -> 컬렉션 클래스 사용 ( List ) + indexOf() 매서드	
		
		
		
		// [3] 암기. 람다와 스트림
		// 배열 -> List 변환. indexOf() 매서드
		int index = Arrays.stream(m)					//배열 -> Stream 으로 변환
			.boxed()						//기본형 int -> 래퍼클래스 Integer 변환 [] 변환
			.collect(Collectors.toList()) 	//List 로 변환
			.indexOf(2);
		System.out.println(" > index = " + index);
		m = Arrays.copyOf(m, m.length + 1);
		System.out.println(Arrays.toString(m));
		
		for (int i =  m.length-2; i>= index; i--) {
			m[i+1]= m[i];
		} //for
		
		// 2. 
		int [] temp = new int[m.length+1];
		
		m[index] = 100;
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m = temp;
		m[index] = 100;
		System.out.println( Arrays.toString(m));
		
		
		// [문제]  다시 100 삭제
	      // [3, 5, 2, 4, 1, 6]
	      index = 2 ;  // 위치가 2인 100정수를 삭제 
	      temp = new int[m.length-1];
	      System.arraycopy(m, 0, temp, 0, index);
	      System.arraycopy(m, index+1, temp, index, m.length-1- index);
	      // System.arraycopy(m, index+1, temp, index, temp.length - index);
	      m = temp;
	      System.out.println( Arrays.toString(m) );
		
		
		
		
		
	}

}
