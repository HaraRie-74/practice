package practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        // 5個のデータを入力する
	        int x[]  = new int[5];
	        for (int i = 0; i < 5; i++) {
	            x[i]  = sc.nextInt();
	        }
	        // 逆順に出力
	        for (int i = 4; i >= 0; i--) {
	            System.out.print(x[i] + " ");
	        }
	}

}