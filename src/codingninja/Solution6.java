package codingninja;

import java.util.ArrayList;

// https://www.codingninjas.com/codestudio/problems/best-time-to-buy-and-sell-stock_8230746?challengeSlug=striver-sde-challenge&leftPanelTab=1
// 6. Best Time to Buy and Sell Stock
public class Solution6 {
    public static int maximumProfit(ArrayList<Integer> prices) {

        int maxProfit = 0;
        int min = prices.get(0);
        int n = prices.size();

        for (int i = 1; i < n; i++) {
            maxProfit = Math.max(maxProfit, prices.get(i) - min);
            if (min > prices.get(i)) {
                min = prices.get(i);
            }
        }
        return maxProfit;
    }
}