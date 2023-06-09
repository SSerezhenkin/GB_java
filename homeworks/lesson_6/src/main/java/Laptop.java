public class Laptop {
    private String brand;        // бренд ноутбука
    private String model;        // модель ноутбука
    private double screenSize;   // размер экрана (в дюймах)
    private int RAM;             // объем оперативной памяти (в ГБ)
    private int storageSize;     // объем накопителя (в ГБ)
    private double price;        // цена ноутбука

    public Laptop(String brand, String model, double screenSize, int RAM, int storageSize, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.storageSize = storageSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getStorageSize() {
        return storageSize;
    }
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void displaySpecs() {
        System.out.println("Брэнд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("ОЗУ: " + RAM + " Гб");
        System.out.println("Диск: " + storageSize + " Гб");
        System.out.println("Цена: $" + price);
    }
}
