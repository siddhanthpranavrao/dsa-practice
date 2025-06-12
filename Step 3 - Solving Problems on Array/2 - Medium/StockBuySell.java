public class StockBuySell {

    public static int maxProfit(int[] prices) {
        int profit = 0; int min = prices[0];
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            int cost = prices[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(prices[i], min);
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
