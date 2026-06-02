class Solution {
    public int maxProfit(int[] prices) {
        // int len = prices.length;
        // int min = Integer.MAX_VALUE;
        // int max=0;
        // for(int i = 0; i<len; i++){
        //     if (prices[i]<min){
        //         min=prices[i];
        //         max=0;
        //     }else{
        //         if(prices[i]>max){
        //             max=prices[i];
        //         }
        //     }
        // }
        // if ( max == 0 ){
        //     return max;
        // }else{
        //     return max-min;
        // }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }

        return maxProfit;
    }
}
