package striversA2Z.arrays.medium;

public class Q06_stockBuyAndSell {
	
	public static int maxProfit(int[] prices) {
		int maxP = 0;
		int low = prices[0];
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<low) low = prices[i];
			int p = prices[i]-low;
			maxP = Math.max(maxP, p);
		}
		
		return maxP;
	}
	
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}
}
