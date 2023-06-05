package practice;

public class Practice {

	public static void main(String[] args) {
		 int[] array = new int[10];
		 for (int i = 0; i < array.length; i++) {
			 array[i] = i;
		 }
		 System.out.print("偶数：");
		 for (int value : array) {
			 if (value % 2 == 0) {
				 System.out.print(value + " ");
			 }
		 }
		 System.out.println(" ");
		 
		 System.out.print("奇数：");
		 for (int value : array) {
			 if (value % 2 == 1) {
				 System.out.print(value + " ");
			 }
		 }
	}

}