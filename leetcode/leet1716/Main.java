package leetcode.leet1716;

public class Main {
    public static void main(String[] args) {
        Problem1716 problem1716=new Problem1716();
        int xDay=4;
       // int xDay=10;
       //  int xDay=20;
        // int xDay=4;

        int x=problem1716.totalMoney(xDay);
        System.out.println("x day "+x);
        int y=problem1716.totalMoney2(xDay);
        System.out.println("y day "+y);
    }
}
