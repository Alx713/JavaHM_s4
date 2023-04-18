import java.util.LinkedList;
import java.util.ListIterator;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(revertedLinkedList(list));
    }

    static LinkedList<Integer> revertedLinkedList(LinkedList<Integer> array){
        LinkedList<Integer> result = new LinkedList<>();
        ListIterator<Integer> iterator = array.listIterator(array.size());
        while (iterator.hasPrevious()) {
            result.add(iterator.previous());
        }
        return result;
    }
}