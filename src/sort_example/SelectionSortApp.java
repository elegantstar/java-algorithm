package sort_example;

public class SelectionSortApp {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 3, 8, 10, 9};
				 
		selectionSort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
	
	public static void selectionSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
}
