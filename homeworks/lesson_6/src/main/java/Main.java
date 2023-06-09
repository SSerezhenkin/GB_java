import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptopSet = createLaptopSet(); // Создание и заполнение Set с ноутбуками

        Map<Integer, String> filterCriteria = new HashMap<>();
        filterCriteria.put(1, "brand");
        filterCriteria.put(2, "model");
        filterCriteria.put(3, "screenSize");
        filterCriteria.put(4, "RAM");
        filterCriteria.put(5, "storageSize");

        Scanner scanner = new Scanner(System.in);

        List<String> filters = new ArrayList<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию (или 0 для завершения):");
        System.out.println("1 - бренд");
        System.out.println("2 - модель");
        System.out.println("3 - размер экрана");
        System.out.println("4 - ОЗУ");
        System.out.println("5 - объём диска");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода цифры

        while (choice != 0) {
            if (filterCriteria.containsKey(choice)) {
                String filterCriterion = filterCriteria.get(choice);

                System.out.println("Введите значение для фильтра \"" + filterCriterion + "\":");
                String filterValue = scanner.nextLine();

                filters.add(filterCriterion + ":" + filterValue);
            } else {
                System.out.println("Некорректный выбор критерия фильтрации.");
            }

            System.out.println("Введите следующую цифру (или 0 для завершения):");
            choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода цифры
        }

        filterAndDisplayLaptops(laptopSet, filters);

        scanner.close();
    }

    // Метод для фильтрации и вывода ноутбуков, отвечающих критериям фильтрации
    public static void filterAndDisplayLaptops(Set<Laptop> laptopSet, List<String> filters) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptopSet) {
            boolean satisfiesFilters = true;

            for (String filter : filters) {
                String[] filterParts = filter.split(":");
                String filterCriterion = filterParts[0];
                String filterValue = filterParts[1];

                if (filterCriterion.equalsIgnoreCase("brand")) {
                    if (!laptop.getBrand().equalsIgnoreCase(filterValue)) {
                        satisfiesFilters = false;
                        break;
                    }
                } else if (filterCriterion.equalsIgnoreCase("model")) {
                    if (!laptop.getModel().equalsIgnoreCase(filterValue)) {
                        satisfiesFilters = false;
                        break;
                    }
                } else if (filterCriterion.equalsIgnoreCase("screenSize")) {
                    if (laptop.getScreenSize() != Double.parseDouble(filterValue)) {
                        satisfiesFilters = false;
                        break;
                    }
                } else if (filterCriterion.equalsIgnoreCase("RAM")) {
                    if (laptop.getRAM() != Integer.parseInt(filterValue)) {
                        satisfiesFilters = false;
                        break;
                    }
                } else if (filterCriterion.equalsIgnoreCase("storageSize")) {
                    if (laptop.getStorageSize() != Integer.parseInt(filterValue)) {
                        satisfiesFilters = false;
                        break;
                    }
                }
            }

            if (satisfiesFilters) {
                filteredLaptops.add(laptop);
            }
        }

        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки, отвечающие заданным критериям фильтрации, не найдены.");
        } else {
            System.out.println("Результаты поиска:");
            for (Laptop laptop : filteredLaptops) {
                laptop.displaySpecs();
                System.out.println("---------------------------");
            }
        }
    }

    // Метод для создания и заполнения Set с ноутбуками (пример)
    public static Set<Laptop> createLaptopSet() {
        Set<Laptop> laptopSet = new HashSet<>();

        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", 13.3, 16, 512, 1999.99);
        Laptop laptop2 = new Laptop("Dell", "XPS 13", 13.4, 16, 512, 1699.99);
        Laptop laptop3 = new Laptop("Lenovo", "ThinkPad X1 Carbon", 14.0, 16, 1000, 1799.99);
        Laptop laptop4 = new Laptop("HP", "Spectre x360", 13.3, 8, 256, 1299.99);
        Laptop laptop5 = new Laptop("Asus", "ZenBook 14", 14.0, 16, 512, 1399.99);
        Laptop laptop6 = new Laptop("Acer", "Predator Helios 300", 15.6, 16, 1000, 1499.99);
        Laptop laptop7 = new Laptop("Microsoft", "Surface Laptop 4", 15.0, 8, 256, 1299.99);
        Laptop laptop8 = new Laptop("Huawei", "MateBook X Pro", 13.9, 16, 512, 1599.99);
        Laptop laptop9 = new Laptop("MSI", "GS66 Stealth", 15.6, 32, 1000, 2199.99);
        Laptop laptop10 = new Laptop("Razer", "Blade 15", 15.6, 16, 512, 1999.99);

        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);
        laptopSet.add(laptop8);
        laptopSet.add(laptop9);
        laptopSet.add(laptop10);

        return laptopSet;
    }
}