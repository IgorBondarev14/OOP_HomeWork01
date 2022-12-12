import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Вода Saint Spring", 5.5, "Негазированная");
        VendingMachine machine1 = new VendingMachine();
        System.out.println("Товары в аппарате №1");
        System.out.println("Наименование --- Стоимость --- Вкус");
        System.out.println("-----------------------------------");
        System.out.println(machine1);

        List<Product> productList = new ArrayList<>();
        productList.add(water);
        productList.add(new Product("Чипсы Lays", 12.0));
        productList.add(new Product("Тульский пряник", 14.5));
        productList.add(new Soda("Sprite", 9.9, "lemon"));
        productList.add(new Juice("Сок", 9.9, "яблочный"));
        productList.add(new Juice("Сок", 9.9, "вишнёвый"));
        productList.add(new Soda("Вода Saint Spring", 5.5, "Газированная"));

        VendingMachine machine2 = new VendingMachine(productList);
        System.out.println("Товары в аппарате №2");
        System.out.println("Наименование --- Стоимость --- Вкус");
        System.out.println("-----------------------------------");
        System.out.println(machine2);
        System.out.println("Результаты поиска по названию:");
        System.out.println(machine2.findByName("Сок"));
        System.out.println("Результаты поиска по цене:");
        System.out.println(machine2.findByPrice(9.9));
        System.out.println("Результаты поиска по диапазону цен:");
        System.out.println(machine2.findByPriceRange(3.9, 5.560));
    }
}