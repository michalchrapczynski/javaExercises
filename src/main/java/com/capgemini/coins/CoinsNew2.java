package com.capgemini.coins;

import java.util.List;

/**
 * Created by ldrygala on 2015-02-06.
 * <p/>
 * Consider N coins aligned in a row. Each coin is showing either heads or
 * tails. The adjacency of these coins is the number of adjacent pairs of coins
 * with the same side facing up.
 * <p/>
 * It must return the maximum possible adjacency that can be obtained by
 * reversing exactly one coin (that is, one of the coins must be reversed).
 * Consecutive elements of array A represent consecutive coins in the row. Array
 * A contains only 0s and/or 1s: 0 represents a coin with heads facing up; 1
 * represents a coin with tails facing up. For example, given array A consisting
 * of six numbers, such that:
 * <p/>
 * A[0] = 1 A[1] = 1 A[2] = 0 A[3] = 1 A[4] = 0 A[5] = 0
 * <p/>
 * the function should return 4. The initial adjacency is 2, as there are two
 * pairs of adjacent coins with the same side facing up, namely (0, 1) and (4,
 * 5). After reversing the coin represented by A[2], the adjacency equals 4, as
 * there are four pairs of adjacent coins with the same side facing up, namely:
 * (0, 1), (1, 2), (2, 3) and (4, 5), and it is not possible to obtain a higher
 * adjacency. The same adjacency can be obtained by reversing the coin
 * represented by A[3].
 */
public class CoinsNew2 {
	public static int solution(List<Integer> coins) {
		int result = 0;

		if (coins.size() > 1) {
			for (int i = 0; i < coins.size(); i++) {
				int lengthWithFlip = getLengthWithFlip(coins, i);
				int lengthWithFlipedFirst = getLengthWithFlipedFirst(coins, i);

				int maxThisRound = Math.max(lengthWithFlip,
						lengthWithFlipedFirst);
				result = Math.max(result, maxThisRound);

				int maxPossibleLenght = coins.size() - i;
				if (maxThisRound >= maxPossibleLenght) {
					break;
				}
			}

		}

		return result;
	}

	private static int getLengthWithFlip(List<Integer> coins, int startingCoin) {
		int referenceCoin = coins.get(startingCoin);

		return getLength(coins, startingCoin, referenceCoin, false);
	}

	private static int getLengthWithFlipedFirst(List<Integer> coins,
			int startingCoin) {
		int referenceCoin = (coins.get(startingCoin) + 1) % 2;

		return getLength(coins, startingCoin, referenceCoin, true);
	}

	private static int getLength(List<Integer> coins, int startingCoin,
			int referenceCoin, boolean usedFlipping) {
		int current = 0;
		for (int i = startingCoin + 1; i < coins.size(); i++) {
			if (coins.get(i) == referenceCoin) {
				current++;
			} else if (!usedFlipping) {
				usedFlipping = true;
				current++;
			} else {
				break;
			}
		}

		if (!usedFlipping) {
			current--;
		}
		return current;
	}

}
