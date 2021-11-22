package sort;

public class SelectionSort {

	public static void main(String[] args) {

		
		int[] nums = {2, 37, 532, 77, 2, 67};
		
		// 2, 37, 532, 77, 2, 67
		// 2, 2, 532, 77, 37, 67
		// 2, 2, 37, 532, 77, 67
		// 2, 2, 37, 67, 532, 77
		// 2, 2, 37, 67, 77, 532
		
		sort(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+", ");
		}
	}
// 선택정렬 Selection Sort, 시간 복잡도 O(N^2), 공간 복잡도 O(1)
	public static void sort(int[] nums) {
		for(int i=0; i<nums.length -1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
}
