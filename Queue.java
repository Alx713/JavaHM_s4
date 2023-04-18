import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int item){
        list.addLast(item);
    }
    public int dequeue(){
        return list.pollFirst();
    }
    public int first(){
        return list.peekFirst();
    }

}