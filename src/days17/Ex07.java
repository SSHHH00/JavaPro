package days17;

/**
 * @author C_Seung_H0
 * @date 2025. 2. 25. - 오전 11:47:10
 * @subject
 * @content	싱글톤 ,시험 
 * 			volatile 키워드
 * 			volatile은 자바에서 변수의 값을
 * 			메인 메모리에 직접 저장하고 읽도록 보장하는 키워드다.
			즉, CPU 캐시를 사용하지 않고 항상 최신 값을 보장한다.


 */
public class Ex07 {

	public static void main(String[] args) {


	}//main

}//class

//싱글톤패턴	- DAO (Data Access Object)
class BoardDAO{

	private static BoardDAO	boardDAO =null;

	//외부에서 객체생성 X
	private BoardDAO() {

	}
	//	public static synchronized BoardDAO getInstance() {
	//        if (boardDAO == null) { // 필요할 때 생성
	//        	boardDAO = new BoardDAO();
	//        }
	//        return boardDAO;
	//    }
	public static BoardDAO getInstance() {
		if (boardDAO == null) {
			synchronized (BoardDAO.class) {
				if (boardDAO == null) {
		boardDAO = new BoardDAO();
		}
		}
		}
		return boardDAO;
	}
}













