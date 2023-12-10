package leetcode.leet2;

import algorithm.linkedlist.LinkedList;

public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1=getAsNumber(l1);
        StringBuilder s2=getAsNumber(l2);

        String i1=s1.reverse().toString();
        String i2=s2.reverse().toString();

        Integer in1=Integer.valueOf(i1);
        Integer in2=Integer.valueOf(i2);

        Integer in3=in1+in2;

        String string=in3+"";
        
        String[] str=string.split("");
        Integer[] integers=new Integer[str.length];

        for (int i = 0; i < str.length; i++) {
            integers[i]=Integer.valueOf(str[i]);
        }

        for (int index = 0; index < integers.length; index++) {
            
        }


        return null;
    }

    private StringBuilder getAsNumber(ListNode l1) {
        StringBuilder stringBuilder=new StringBuilder();
        ListNode lhead=l1;
        while (lhead.next!=null) {
             stringBuilder.append(lhead.val);
             lhead=lhead.next;   
             System.out.print("l - "+lhead);
        }
        stringBuilder.append(lhead.val);
        return stringBuilder.reverse();
    }   
}
