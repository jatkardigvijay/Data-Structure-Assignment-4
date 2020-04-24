package com.jbd;

public class SpiralPrintOf2DArray {

	/*
	 * public static void spiralPrintOf2dArray(int[][] arr, int m, int n) { int i, k
	 * = 0, l = 0;
	 * 
	 * while (k < m && l < n) { for (i = l; i < n; ++i) { System.out.print(arr[k][i]
	 * + " "); } k++; }
	 * 
	 * for (i = k; i < m; ++i) { System.out.print(arr[i][n - 1] + " "); } n--; if (k
	 * < m) { for (i = n - 1; i >= l; --i) { System.out.print(arr[m - 1][i] + " ");
	 * } m--; } if (l < n) { for (i = m - 1; i >= k; --i) {
	 * System.out.print(arr[i][l] + " "); } l++; } }
	 * 
	 * public static void main(String[] args) { int r=3; int c=6; int[][]arr = { {1,
	 * 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18} };
	 * spiralPrintOf2dArray(arr, r, c); }
	 */

	// Function print matrix in spiral form
	static void spiralPrint(int m, int n, int a[][]) {
		int i, k = 0, l = 0;
		/*
		 * k - starting row index m - ending row index l - starting column index n -
		 * ending column index i - iterator
		 */

		while (k < m && l < n) {
			// Print the first row from the remaining rows
			for (i = l; i < n; ++i) {
				System.out.print(a[k][i] + " ");
			}
			k++;

			// Print the last column from the remaining columns
			for (i = k; i < m; ++i) {
				System.out.print(a[i][n - 1] + " ");
			}
			n--;

			// Print the last row from the remaining rows */
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(a[m - 1][i] + " ");
				}
				m--;
			}

			// Print the first column from the remaining columns */
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}
	}

	// driver program
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}
}
