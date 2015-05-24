package stoinost;

import java.util.Random;

public class stoinost {

	public static void main(String[] args) {
		Random rnd = new Random();

		int[] nums = new int[20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(1000);

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		int maxSubArrayLenght = 1;
		int currentSubArrayLengh = 1;
		System.out.println();

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {
				currentSubArrayLengh++;
			} else {

				if (maxSubArrayLenght < currentSubArrayLengh) {
					maxSubArrayLenght = currentSubArrayLengh;
				}
				currentSubArrayLengh = 1;

			}
		}
		System.out.println(maxSubArrayLenght);
	}

}
