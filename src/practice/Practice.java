package practice;

//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる

public class Practice {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		int count = 0;
		int sum = 0;
		for (int value : array) {
			if (value % 2 == 0) {
				count++;
				sum += value;
			}
		}
		System.out.println("個数：" + count);
		System.out.println("合計：" + sum);
	}
}