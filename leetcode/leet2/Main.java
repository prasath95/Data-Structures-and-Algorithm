package leetcode.leet2;

public class Main {
    public static void main(String[] args) {
        Problem2 problem2=new Problem2();
        // ListNodel1 = [2,4,3]; l2 = [5,6,4];

         ListNode l3=new ListNode();
         l3.val=3;
         l3.next=null;

         ListNode l2=new ListNode();
         l2.val=4;
         l2.next=l3;

         ListNode l1=new ListNode();
         l1.val=2;
         l1.next=l2;

         ListNode l4=new ListNode();
         l4.val=4;
         l4.next=null;

         ListNode l5=new ListNode();
         l5.val=6;
         l5.next=l4;

         ListNode l6=new ListNode();
         l6.val=5;
         l6.next=l5;

      
        problem2.addTwoNumbers(l1, l5);
    }
}
