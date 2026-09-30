package array;

class BuyAndSellStocks {

    static int maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum Profit = " + maxProfit(prices));
    }
}
