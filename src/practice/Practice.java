package practice;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 11);
		}
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}