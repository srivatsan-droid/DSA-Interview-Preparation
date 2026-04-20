package Blind_75.SlidingWindow;

public class BestTimeToBuySellStock {
    public static int maxProfit(int prices[]) {
        int left = 0;
        int maxProfit = 0;
        for(int right = 1;right < prices.length;right++) {
            if(prices[right] < prices[left]) {
                left = right;
            }
            else {
                maxProfit = Math.max(maxProfit,prices[right] - prices[left]);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}
