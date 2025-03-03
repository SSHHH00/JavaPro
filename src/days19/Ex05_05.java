package days19;

import java.util.StringJoiner;

public class Ex05_05 {
    public static void main(String[] args) {

        // [ 2 ] StringJoiner 클래스 사용
        String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
        String[] team1Arr = team1.split("\\s*,\\s*"); // 쉼표 기준으로 나누면서 공백 제거

        // StringJoiner를 사용하여 HTML 목록 생성
        StringJoiner sj = new StringJoiner("\n  <li>", "<ol>\n  <li>", "\n</li>\n</ol>");
        for (String name : team1Arr) {
            sj.add(name);
        }

        // 최종 HTML 출력
        System.out.println(sj.toString());
    }
}
