package days13;

import java.util.Scanner;

/**
 * @author C_Seung_H0
 *		2차원 배열 중요도
 */		
public class Ex04_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("> 게임 횟수 입력 ? ");
	      int gameNumber = sc.nextInt();
	      
	      int [][] lotto = new int[gameNumber][6];
	      
	      fillLottos(lotto, gameNumber);
	      dispLottos(lotto, gameNumber);

	   } // main

	   private static void dispLottos(int[][] lotto, int gameNumber) {
	      for (int i = 0; i < gameNumber; i++) {
	         dispLotto(lotto[i]);
	      } // for i
	   }

	   private static void fillLottos(int[][] lotto, int gameNumber) {
	      for (int i = 0; i < gameNumber; i++) {
	         fillLotto(lotto[i]);
	      } // for i
	   }
	   
	   // days08.Ex07.java 
	   private static void fillLotto(int[] lotto) {
	      int index = 0, n;
	      lotto[index++] = getRandomInteger(1, 45); 
	      while ( index <= 5 ) {
	         n =  getRandomInteger(1, 45);              
	         if( !isDuplicateLotto(lotto, n, index) ) 
	            lotto[index++] = n;
	      } // while

	   }
	   // days08.Ex07.java 
	   private static void dispLotto(int[] lotto) {
	      System.out.print("1게임 : ");
	      for (int i = 0; i < lotto.length; i++) {
	         System.out.printf("[%d]", lotto[i]);
	      } // for i
	      System.out.println();
	   }
	   // days08.Ex07.java 
	   private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
	      boolean flag = false;
	      for (int i = 0; i < index; i++) {
	         if( lotto[i] == n ) {
	            System.out.println("*");
	            flag = true;
	            break;
	         }
	      } // for i
	      return flag;
	   }
	   // days08.Ex07.java 
	   public static int getRandomInteger(int min, int max) {      
	      return (int)( Math.random()*(max-min+1))+min;
	   }

	} // class

