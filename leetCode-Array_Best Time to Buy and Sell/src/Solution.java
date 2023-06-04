
public class Solution {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int[] prices2 = {1,2,3,4,5};
		int[] prices3 = {7,6,4,3,1};
		int profit = maxProfit(prices3);
		System.out.println(profit);
	}

	public static int maxProfit(int[] prices) {
		int j, k;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			j = i;
			k = i + 1;
			while (k < prices.length && prices[j] < prices[k]) {
				j++;
				k++;
			}
			if (i < j) {
				profit += prices[j] - prices[i];
				i = j;
			}
		}
		
        return profit;
    }
}
