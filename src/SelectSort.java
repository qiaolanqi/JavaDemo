public class SelectSort {
	public static void sort(int[] array) {
		int index, tValue;
		for (int i = 0; i < array.length; i++) {
			index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			if (index != i) {
				tValue = array[i];
				array[i] = array[index];
				array[index] = tValue;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 6, 2, 4, 5, 1, 9, 10, 7 };
		sort(a);
		for (int v : a) {
			System.out.print(v + " ");
		}
	}
}