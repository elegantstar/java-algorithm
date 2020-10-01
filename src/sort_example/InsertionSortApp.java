package sort_example;

public class InsertionSortApp {

	public static void main(String[] args) {

		/**
		 * int[] nums = {7, 3, 10, 6, 1, 9}
		 * 1회차 : {3, 7, 10, 6, 1, 9}
		 * 2회차 : {3, 7, 10, 6, 1, 9}
		 * 3회차 : {3, 6, 7, 10, 1, 9}
		 * 4회차 : {1, 3, 6, 7, 10, 9}
		 * 5회차 : {1, 3, 6, 7, 9, 10}
		 */
		
		int[] nums = {7, 3, 10, 6, 1, 9};
		
		insertionSort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}
	
	public static void insertionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			for(int j = i-1; j >= 0; j--) {
				if(temp < nums[j]) {
					nums[j+1] = nums[j];
					nums[j] = temp;
				} else {
					nums[j+1] = temp;
					break;
				}
			}
		}
	}

}
