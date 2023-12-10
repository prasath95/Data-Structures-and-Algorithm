package algorithm.queue;

public class Queue {
    int[] queue=new int[5];
    int front=0;
    int rear=0;
    int size=0;

    public void enqueue(int data){
        queue[rear]=data;
        rear=(rear+1)%5;
        size++;
    }

    public int dequeue(){
        int data=queue[front];
        front=(front-1)%5;
        size--;
        return data;
    }

    public void show(){
        for (int i = 0; i < size; i++) {
             System.out.println(" - "+queue[(front+i)%5]);
        }
       
    }
}
