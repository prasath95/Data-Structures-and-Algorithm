package questions.best_time_to_buy_and_sell_stocks;

public class Problem {
    public int findMaxProfit(int[] array){
        int maxProfit=0;
        int lowPrice=array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i]<lowPrice){
                lowPrice=array[i];
            }else if(maxProfit<array[i]-lowPrice){
                maxProfit=array[i]-lowPrice;
            }

        }
        return maxProfit;
    }
}
