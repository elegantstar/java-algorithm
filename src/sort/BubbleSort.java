package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// Comparable Sort(���ϴ� ����) �߿��� ���� ���� �ð����⵵�� NlogN
		/**
		 * Sort : �����͸� �������� �Ǵ� ������������ �����ϴ� ��
		 * nums = [5, 7, 1, 2, 4]
		 * 
		 * 1ȸ�� : [5, 1, 2, 4, 7]
		 * 2ȸ�� : [1, 2, 4, 5, 7]
		 * 3ȸ�� : [1, 2, 4, 5, 7]
		 * 4ȸ�� : [1, 2, 4, 5, 7]
		 */
		
		int nums[] = {5, 7, 1, 2, 4};
		
		bubbleSort(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}
	
// Bubble Sort, �ð� ���⵵ O(N^2), ���� ���⵵ O(1)
	public static void bubbleSort(int nums[]) {
		for(int i=nums.length-1; i > 0 ; i--) {
			for(int j=0; j < i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
				
	}
	
	// 1. ������ �ð� ���⵵(Best Time Complexity) : O(n), ���ĵ� ����
	// 2. ��� �ð� ���⵵(Average Time Complexity) : O(n^2)
	// 3. �־��� �ð� ���⵵(Worst Time COmplexity) : O(n^2)
	
	// ���� �ǹ̰� �ִ� �ð� ���⵵ : �־��� �ð� ���⵵
	// �׻� �־��� ��Ȳ�� ��� �ؾ� �Ѵ�. (default : �־�)
	
	public static void bubbleSortOpt(int[] nums) {
		for(int i=nums.length-1; i > 0 ; i--) {
			boolean isSwapped = false;
			for(int j=0; j < i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
					isSwapped = true;
				}
			}
			
			if(!isSwapped) { 		// if is not swapped
				break;
			}
		}
	}
}

