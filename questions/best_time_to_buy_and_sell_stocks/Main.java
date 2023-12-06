package questions.best_time_to_buy_and_sell_stocks;

public class Main {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int profit=5;

        Problem problem=new Problem();
        int output=problem.findMaxProfit(prices);
        System.out.println("Max Profit is "+output);
    }
}
