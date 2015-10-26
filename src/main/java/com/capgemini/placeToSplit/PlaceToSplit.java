package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side. Example: { {{ canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false canBalance({10, 10}) → true }}}
 */
public final class PlaceToSplit {

	/**
	 * Private constructor for final class
	 */
	private PlaceToSplit() {
		// empty
	}

	public static boolean canBalance(int[] nums) {
		int sum = sumNums(nums);
		return nums.length > 1 && sum % 2 == 0 && canBalance(nums, sum / 2);
	}

	private static int sumNums(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return sum;
	}

	private static boolean canBalance(int[] nums, int sumOfHalf) {
		for (int i = 0; i < nums.length && sumOfHalf > 0; i++) {
			sumOfHalf -= nums[i];
		}

		return sumOfHalf == 0;
	}
}