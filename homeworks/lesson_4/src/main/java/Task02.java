import java.util.LinkedList;
import java.util.Random;

public class Task02 {

    public static LinkedList<Integer> getList(int size){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<size; i++) {
            list.add(random.nextInt(100)+1);
        }
        return list;
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(4);
        list.enqueue(5);
        list.enqueue(6);
        System.out.print("Оригинальный список: ");
        list.printList();
        System.out.println("Прощаемся с первым элементом: " + list.dequeue());
        System.out.print("Новый список: ");
        list.printList();
        System.out.println("Теперь первый элемент: " + list.first());
    }
}