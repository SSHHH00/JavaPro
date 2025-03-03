package days19;

public class Ex05_02 {
    public static void main(String[] args) {

        String s = "TODO Auto-gernerated method stub";

        // 정확한 설명으로 수정함
        // StringBuffer sb = new StringBuffer(s);    // 멀티스레드에 안전함(동기화O)
        // StringBuilder sb = new StringBuilder(s);  // 멀티스레드에 안전 X(동기화X)

        // Auto 라는 문자열을 찾아서 [hi] 문자열 삽입
        int index = s.indexOf("Auto");
        int len = "Auto".length();
        System.out.println(s.substring(0, index + len) + "[hi]" + s.substring(index + len));

        StringBuilder sb = new StringBuilder(s);

        // String s에서 "method" 문자열을 찾아서 삭제
        index = s.indexOf("method");
        len = "method".length();
        System.out.println(s.substring(0, index) + s.substring(index + len));

        // 삽입: 정확하게 문자열을 넣어야 함
        sb.insert(index + len, "[hi]");

        // 삭제: 올바른 끝인덱스 설정(index + len)
        sb.delete(index, index + len);

        // method -> 메소드로 수정
        int start = sb.indexOf("method");
        if (start != -1) {
            int end = start + "method".length();
            sb.replace(start, end, "메소드");
        }

        sb.reverse();

        System.out.println(sb);

    }//main
}//class
