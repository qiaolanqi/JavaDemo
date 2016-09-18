public class QuickSort {
	public static void main(String[] args) {
		int array[] = { 6, 2, 4, 5, 1, 9, 10, 7 };
		quickSort(array);
		for (int v : array) {
			System.out.print(v + " ");
		}
	}

	private static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int left, int right) {
		// 子序列为1，直接返回
		if (left >= right)
			return;
		// 划分:完成之后，分为左右序列，左边所有元素小于array[index]，右边所有元素大于array[index]
		int index = partition(array, left, right);
		// 对左右子序列递归排序
		quickSort(array, left, index - 1);
		quickSort(array, index + 1, right);
	}

	private static int partition(int[] array, int left, int right) {
		int i = left;
		int j = right + 1;
		while (true) {
			// 从左至右扫描，如果碰到比基准元素array[left]小，则该元素已经位于正确的分区，i自增，继续比较i+1；
			// 否则，退出循环，准备交换
			while (array[++i] <= array[left]) {
				if (i == right)
					break;
			}
			// 从右自左扫描，如果碰到比基准元素array[left]大，则该元素已经位于正确的分区，j自减，继续比较j-1
			// 否则，退出循环，准备交换
			while (array[--j] >= array[left]) {
				if (j == left) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			// 交换array[i],array[j]两个元素
			swap(array, i, j);
		}
		// 经过相遇后，最后一次a[i]和a[j]的交换
		// array[j]比array[left]小，array[i]比array[left]大，所以将基准元素与array[j]交换
		swap(array, left, j);
		// 返回扫描相遇的位置点
		return j;
	}

	private static void swap(int[] array, int i, int j) {
		int value = array[i];
		array[i] = array[j];
		array[j] = value;
	}
}