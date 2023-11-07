import stack.DStack;
import stack.Stack;

/**
 * main
 */
 public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

       // Stack obj = new Stack();
        DStack obj = new DStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        // obj.push(4);
        // obj.push(5);
        // obj.push(6);
        // obj.push(7);
       
        // System.out.println("pop");
        // obj.pop();

        obj.show();
       
        System.out.println( "size is "+ obj.size());
        System.out.println( "capacity is "+ obj.capacity);



    }

}