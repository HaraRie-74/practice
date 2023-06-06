package practice;

//1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる

public class Practice {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i + 1;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}
}