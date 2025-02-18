package days12;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 테스트용 배열
        shuffle(m);
    }

    private static void shuffle(int[] m) {
        int idx1, idx2;
        Random rnd = new Random();
        for (int i = 0, temp; i < 10; i++) {
            idx1 = rnd.nextInt(m.length);
            idx2 = rnd.nextInt(m.length);
            if (idx1 == idx2) {
                i--;
            } else {
                System.out.printf("%d - %d \n", idx1, idx2);
                temp = m[idx1];
                m[idx1] = m[idx2];
                m[idx2] = temp;
            }
        }
    }
}
