public class Task_2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println(queue.list);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.list);
        System.out.println(queue.first());
        System.out.println(queue.list);
    }
}