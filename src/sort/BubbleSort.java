package sort;

public class BubbleSort {

	public static void main(String[] args) {
		// Comparable Sort(비교하는 정렬) 중에서 가장 빠른 시간복잡도는 NlogN
		/**
		 * Sort : 데이터를 오름차순 또는 내림차순으로 정렬하는 것
		 * nums = [5, 7, 1, 2, 4]
		 * 
		 * 1회차 : [5, 1, 2, 4, 7]
		 * 2회차 : [1, 2, 4, 5, 7]
		 * 3회차 : [1, 2, 4, 5, 7]
		 * 4회차 : [1, 2, 4, 5, 7]
		 */
		
		int nums[] = {5, 7, 1, 2, 4};
		
		bubbleSort(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}
	
// Bubble Sort, 시간 복잡도 O(N^2), 공간 복잡도 O(1)
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
	
	// 1. 최적의 시간 복잡도(Best Time Complexity) : O(n), 정렬된 상태
	// 2. 평균 시간 복잡도(Average Time Complexity) : O(n^2)
	// 3. 최악의 시간 복잡도(Worst Time COmplexity) : O(n^2)
	
	// 가장 의미가 있는 시간 복잡도 : 최악의 시간 복잡도
	// 항상 최악의 상황에 대비 해야 한다. (default : 최악)
	
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

