package algorithm.stack;

public class Main {
   public static void main(String[] args) {
      Stack stack=new Stack();
      stack.push(10);
      stack.push(210);
      stack.push(130);
      stack.push(105);

      System.out.println("pop "+stack.pop());
     // stack.pop();

     System.out.println("peek "+stack.peek());

      stack.show();
   }
}
