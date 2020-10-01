package sort;

public class InsertionSort {

	public static void main(String[] args) {

		/**
		 * InsertionSort : 삽입 정렬
		 * 
		 * nums = [5, 1, 7, 2, 4]
		 * 
		 * 1회차 : [1, 5, 7, 2, 4] 	(1을 5의 왼쪽에 삽입)
		 * 2회차 : [1, 5, 7, 2, 4]	(7을 5의 우측에 삽입)
		 * 3회차 : [1, 2, 5, 7, 4]	(2를 1의 우측, 5의 좌측에 삽입)
		 * 4회차 : [1, 2, 4, 5, 7]	(4를 2의 우측, 5의 좌측에 삽입)
		 * 
		 * 최적의 시간 복잡도 : O(n)
		 * 최악의 시간 복잡도 : O(n^2)
		 * 
		 */
		
	}
	
	// 최적의 시간 복잡도 : O(n)
	// 평균, 최악의 시간 복잡도 : O(n^2)
	public static void insertionSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			for(int j = i-1; j >= 0; j--) {
				if(temp < nums[j]) {
					nums[j+1] = nums[i]; // shift 연산
					nums[j] = temp;
				} else {
					nums[j+1] = temp;
					break;
				}
			}
		}
	}
	
}
