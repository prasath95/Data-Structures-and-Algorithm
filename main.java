/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
       
        // System.out.println("pop");
        // obj.pop();

        System.out.println("show peek "+obj.peek());

        obj.show();
        

        
       

    }

}