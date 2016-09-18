import java.util.Arrays;

public class DirectInsertSort {

	public static void main(String args[]) {
		int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5 };
		int[] sortValues = InsertSort(values);
		// 排序后打印数组中的元素
		System.out.println(Arrays.toString(sortValues));
	}

	public static int[] InsertSort(int[] arr) {
		int i, j;
		int insertNote;// 要插入的数据
		int[] array = arr;
		// 从数组的第二个元素开始循环将数组中的元素插入
		for (i = 1; i < array.length; i++) {
			// 设置数组中的第2个元素为第一次循环要播讲的数据
			insertNote = array[i];
			j = i - 1;
			while (j >= 0 && insertNote < array[j]) {
				// 如果要播讲的元素小于第j个元素,就将第j个元素向后移动
				array[j + 1] = array[j];
				j--;
			}
			// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
			array[j + 1] = insertNote;
		}
		return array;
	}
}
