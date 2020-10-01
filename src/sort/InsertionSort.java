package sort;

public class InsertionSort {

	public static void main(String[] args) {

		/**
		 * InsertionSort : ���� ����
		 * 
		 * nums = [5, 1, 7, 2, 4]
		 * 
		 * 1ȸ�� : [1, 5, 7, 2, 4] 	(1�� 5�� ���ʿ� ����)
		 * 2ȸ�� : [1, 5, 7, 2, 4]	(7�� 5�� ������ ����)
		 * 3ȸ�� : [1, 2, 5, 7, 4]	(2�� 1�� ����, 5�� ������ ����)
		 * 4ȸ�� : [1, 2, 4, 5, 7]	(4�� 2�� ����, 5�� ������ ����)
		 * 
		 * ������ �ð� ���⵵ : O(n)
		 * �־��� �ð� ���⵵ : O(n^2)
		 * 
		 */
		
	}
	
	// ������ �ð� ���⵵ : O(n)
	// ���, �־��� �ð� ���⵵ : O(n^2)
	public static void insertionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			for(int j = i-1; j >= 0; j--) {
				if(temp < nums[j]) {
					nums[j+1] = nums[i]; // shift ����
					nums[j] = temp;
				} else {
					nums[j+1] = temp;
					break;
				}
			}
		}
	}
	
}
