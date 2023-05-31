import java.util.LinkedList;

public class MyList<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        return list.poll();
    }

    public T first() {
        return list.peek();
    }

    public void printList() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}