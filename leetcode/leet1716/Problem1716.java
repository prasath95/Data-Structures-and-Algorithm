package leetcode.leet1716;



//#EASY
// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

public class Problem1716 {

    public int totalMoney(int n) {
        int fullWeek=n/7;
        int halfWeek=n%7;

        int money=0;

        for (int i = 1; i <= fullWeek; i++) {
            for (int j = i; j < i+7; j++) {
                money+=j;
           }
        }

        for (int i = fullWeek; i < fullWeek+halfWeek; i++) {
            money+=i;
        }
    

     return money+halfWeek;
    }


     public int totalMoney2(int n) {
        int fullWeekMoney=0,partWeekMoney=0;

        if(n<=7){
             for (int i = 1; i <= n; i++) {
                fullWeekMoney+=i;
            }
        }else{
            int weekMoney=0;
            for (int i = 1; i <= 6; i++) {
                weekMoney+=i;
            }

            int fullWeek=n/7;
            int partWeek=n%7;
            int x=0;
            int y=7;

           while (1<=fullWeek) {
            int add=y-x;
             
            int thisWeek=weekMoney+=add;
            fullWeekMoney+=thisWeek;

             x++;
             y++;
             fullWeek--;
           }

           int p=(n/7)+1;

           for (int i = p; i < p+partWeek; i++) {
                partWeekMoney+=i;
           }
        }

     return fullWeekMoney+partWeekMoney;
    }
}
