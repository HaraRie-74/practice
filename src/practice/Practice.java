package practice;

//1〜10までの整数をカンマ区切りで横並びで表示させる

public class Practice {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i] + ",");
		}
	}
}