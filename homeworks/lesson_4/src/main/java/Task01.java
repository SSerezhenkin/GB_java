import java.util.LinkedList;
import java.util.Random;

public class Task01 {

    public static LinkedList<Integer> getList(int size){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<size; i++) {
           list.add(random.nextInt(100)+1);
        }
        return list;
     }

     public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = Task01.getList(20);
        System.out.println("Оригинальный список: " + list);
        LinkedList<Integer> reversedList = Task01.reverseList(list);
        System.out.println("Перевёрнутый список: " + reversedList);


    }
}
