package days12;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int year, month;

        System.out.printf("> year, month input ? ");
        year = sc.nextInt();
        month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        int dayOfWeek = getDayOfWeek(year, month, 1); // 1일의 요일
        int lastDay = getLastDay(year, month); // 해당 월의 마지막 날짜

        System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
        drawLine(60, "-");

        // 요일 출력
        String week = "일월화수목금토";
        for (int i = 0; i < week.length(); i++) {
            System.out.printf("\t%c", week.charAt(i));
        }
        System.out.println();
        drawLine(60, "-");

        // 1일의 요일 맞추기 (공백 추가)
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("\t");
        }

        // 1일부터 마지막 날짜까지 출력
        for (int day = 1; day <= lastDay; day++) {
            System.out.printf("\t%d", day);
            if ((dayOfWeek + day) % 7 == 0) { // 토요일(7번째 요일)마다 줄바꿈
                System.out.println();
            }
        }

        System.out.println();
        drawLine(60, "-");
    }

    private static int getLastDay(int year, int month) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1]; // 배열은 0부터 시작이므로 month - 1 사용
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int getDayOfWeek(int year, int month, int day) {
        int totalDays = getTotalDays(year, month, day);
        return totalDays % 7;
    }

    private static int getTotalDays(int year, int month, int day) {
        int totalDays = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // 1월부터 (month - 1)월까지의 일수 추가
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // 윤년이면 2월을 29일로 조정
        if (month > 2 && isLeapYear(year)) {
            totalDays++;
        }

        totalDays += day;
        return totalDays;
    }

    // Graphic2D.drawLine() 대체 함수
    private static void drawLine(int length, String symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}