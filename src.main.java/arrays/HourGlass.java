package arrays;

import java.util.List;

public class HourGlass {

	/*
	 * Complete the 'hourglassSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int hourglassSum(List<List<Integer>> arr) {

		int sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.size() - 2; i++) {

			for (int j = 1; j < arr.get(i).size() - 1; j++) {

				int total = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j - 1) + arr.get(i + 1).get(j)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j - 1);

				System.out.println(total);

				if (total > sum) {
					sum = total;
				}
			}

		}

		return sum;

	}

}
