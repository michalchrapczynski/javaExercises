package com.capgemini.pascalrectangle;

/**
 * Created by ldrygala on 2015-01-23. 0 1 1 1 1 2 1 2 1 3 1 3 3 1 4 1 4 6 4 1 5
 * 1 5 10 10 5 1 6 1 6 15 20 15 6 1 7 1 7 21 35 35 21 7 1 8 1 8 28 56 70 56 28 8
 * 1 9 1 9 36 84 126 126 84 36 9 1
 */
public class PascalRectangle {
	public long pascal(int c, int r) {
		if (r == 0 || r == c) {
			return 1;
		}

		return pascal(c - 1, r - 1) + pascal(c - 1, r);
	}

	public long pascalIter(int c, int r) {

		int[][] tab = new int[c + 1][c + 1];

		for (int i = 0; i < c + 1; i++) {
			tab[i][0] = 1;
			tab[i][i] = 1;

			if (i > 0) {
				for (int j = 0; j < c; j++) {
					tab[i][j + 1] = tab[i - 1][j] + tab[i - 1][j + 1];
				}
			}
		}

		return tab[c][r];
	}
}
