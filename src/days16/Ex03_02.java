package days16;

public class Ex03_02 {

	public static void main(String[] args) {

		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4));
		
		int [] m = {1,2,3,4,5,6};
		System.out.println(sum(m));
		
	}//main

	
	//가변인자를 가진 sum 매서드를 선언해서 사용하면 편리.
	//int ...args
	/*[가변인자 사용시 주의할점 ]
	 	1. 가변인자는 내부적으로 배열을 사용
	 	2. 오버로딩을 하지 않는게 좋다
	 	3. 비횽ㄹ적이기 떄문에 꼭 필요한 곳에서만 사용.
	 	4. 제일 마지막에 가변인자를 선언한다.
	 */
	public static int sum(int... args) {
        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result; // 잘못된 부분 수정 (result result; → return result;)
    }
}