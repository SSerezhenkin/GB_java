// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("+79000010101", "Иванов И.И.");
        phonebook.put("+79000020202", "Петров П.П.");
        phonebook.put("+79000030303", "Сидоров С.С.");
        phonebook.put("+79000040404", "Иванов И.И.");
        phonebook.put("+79000050505", "Петров П.П.");
        phonebook.put("+79000060606", "Иванов И.И.");

        List<Map.Entry<String, String>> sortedEntries = new ArrayList<>(phonebook.entrySet());

        // Сортировка списка по убыванию количества телефонов
        Collections.sort(sortedEntries, (e1, e2) -> {
            int count1 = getCountOfPhones(phonebook, e1.getValue());
            int count2 = getCountOfPhones(phonebook, e2.getValue());
            return Integer.compare(count2, count1);
        });

        // Вывод отсортированной телефонной книги
        for (Map.Entry<String, String> entry : sortedEntries) {
            System.out.println("Фамилия: " + entry.getValue() + ", Номер телефона: " + entry.getKey());
        }
    }
    private static int getCountOfPhones(HashMap<String, String> phonebook, String lastName) {
        int count = 0;
        for (String value : phonebook.values()) {
            if (value.equals(lastName)) {
                count++;
            }
        }
        return count;
    }
}