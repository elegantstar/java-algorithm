package sort_example;

public class BubbleSortApp {

	public static void main(String[] args) {
		
		int[] nums = {7, 10, 1, 8, 4, 6};
		
		bubbleSort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		System.out.println();
		
		bubbleSortOpt(nums);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}

	public static void bubbleSort(int[] nums) {
		for(int i = nums.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortOpt(int[] nums) {
		for(int i = nums.length-1; i > 0; i--) {
			boolean isSwapped = false;
			for(int j = 0; j < i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
			
		}
	}
	
}
