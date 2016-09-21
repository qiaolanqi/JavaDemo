package sort;
import java.util.Arrays;

public class BubbleSort { // 从小到大排序

	public static void main(String args[]) {
		int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5 };
		int[] sortValues = bubbleSort(values);
		// 排序后打印数组中的元素
		System.out.println(Arrays.toString(sortValues));
	}

	public static int[] bubbleSort(int[] values) {
		int temp;
		for (int i = 0; i < values.length; i++) { // 趟数
			for (int j = 0; j < values.length - i - 1; j++) {// 比较次数
				if (values[j] > values[j + 1]) {
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}
		return values;
	}
}