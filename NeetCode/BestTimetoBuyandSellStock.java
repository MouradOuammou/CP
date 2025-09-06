public class BestTimetoBuyandSellStock 
{
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int res  = maxProfit(prices);
        System.out.println(res);
    }
     public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;


        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            // تحديث أقصى ربح إذا كان أكبر
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // تحديث أقل سعر إذا وجدنا سعر أقل
            if (prices[i] < minwwPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

}