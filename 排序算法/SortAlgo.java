import java.lang.Math;

class SortAlgo {
	
	/*由小到大排序*/
	
	public static void main(String[] args) {
		int length = 1000000;
		int[] arr = createIntArr(length);
		int[] aArr = new int[length];
		int[] bArr = new int[length];
		copyArr(arr, aArr);
		copyArr(arr, bArr);
		long start = System.currentTimeMillis();
		bubbleSort(aArr);
		long end = System.currentTimeMillis();
		System.out.println("冒泡排序耗时：" + (end - start) + "毫秒");
		outPutArr(aArr, 20);
		start = System.currentTimeMillis();
		fastSort(bArr, 0, length - 1);
		end = System.currentTimeMillis();
		System.out.println("快速排序耗时：" + (end - start) + "毫秒");
		outPutArr(bArr, 20);
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j ++) {
				try {
					if (arr[j] < arr[j-1]) {
					arr[j] = arr[j-1] + arr[j];
					arr[j-1] = arr[j] - arr[j-1];
					arr[j] = arr[j] - arr[j-1];
					}
				} catch (Exception e) {
					System.out.println("i=" + i + "  j=" + j);
				}
			}
		}
	}
	
	public static void fastSort(int[] arr, int left, int right) {
		if (left < right) {
			int baseNum = arr[left];
			int i = left, j = right;
			while (i < j) {
				while (i < j && arr[j] >= baseNum) {
					j--;
				}
				if (i < j) {
					arr[i] = arr[j];
				}
				while (i < j && arr[i] <= baseNum) {
					i++;
				}
				if (i < j) {
					arr[j] = arr[i];
				}
			}
			arr[i] = baseNum;
			fastSort(arr, left, i-1);
			fastSort(arr, i+1, right);
		}
	}	
	
	public static int[] createIntArr(int length) {
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = (int)(Math.random() * length);
		}
		return arr;
	}
	
	public static void copyArr(int[] source, int[] dest) {
		for (int i = 0; i < source.length; i++) {
			dest[i] = source[i];
		}
	}
	
	public static void outPutArr(int[] arr, int howLong) {
		System.out.println("原始数组如下：");
		for (int i = 0; i < howLong; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
