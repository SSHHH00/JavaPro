package days19;

import java.io.*;

public class Ex04_06 {

    public static void main(String[] args) {
        String fileName = ".\\src\\days19\\학생명단.txt";  // 파일 경로
        String saveFileName = ".\\src\\days19\\Sist22Class.txt";  // 저장 파일 경로
        String name;

        // 1️⃣ 파일이 없으면 생성
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();  // 파일 생성
                System.out.println("📂 학생명단.txt 파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("❌ 파일 생성 중 오류 발생!");
                e.printStackTrace();
                return;  // 파일이 없으면 프로그램 종료
            }
        }

        // 2️⃣ 파일 읽고 저장
        try (FileReader reader = new FileReader(fileName);
             BufferedReader br = new BufferedReader(reader);
             FileWriter writer = new FileWriter(saveFileName)) {

            while ((name = br.readLine()) != null) {
                String li = String.format("<li>%s</li>\n", name);
                writer.write(li);
                System.out.printf("<li>%s</li>\n", name);
            }

            System.out.println("✅ 파일 변환이 완료되었습니다: " + saveFileName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
