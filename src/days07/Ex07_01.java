package days07;

import java.util.Scanner;

public class Ex07_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user, com;
        char replay = 0;

        boolean stop = false;
        do {
            com = (int) (Math.random() * 3) + 1;

            System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
            user = scanner.nextInt();

            if (user < 1 || user > 3) {
                System.out.println("잘못된 입력입니다. 1, 2, 3 중 선택하세요.");
                continue;
            }

            System.out.printf("> com=%d, user=%d\n", com, user);

            switch (user - com) {
                case 0:
                    System.out.println("무승부");
                    break;
                case 1:
                case -2:
                    System.out.println("사용자 승리!");
                    break;
                case -1:
                case 2:
                    System.out.println("컴퓨터 승리!");
                    break;
            }

            while(true) {
            	System.out.print("\n게임을 계속합니까? (Y/N): ");
                replay = scanner.next().charAt(0);
                String str = String.valueOf(replay);
                str = str.toLowerCase();
                
            	if(str.equals("y")) {
                	break;
                }else if(str.equals("n")) {
                	stop = true;
                	break;
                }else {
                	System.out.println("잘못된 입력값 입니다.");
                }
            }
        } while (!stop);
        	
        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
