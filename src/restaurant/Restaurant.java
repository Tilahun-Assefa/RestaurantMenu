package restaurant;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem spaghetti = new MenuItem(1, "Spaghetti", 25.00);
        MenuItem pizza = new MenuItem(2, "Pizza", 12.50);
        MenuItem salad = new MenuItem(3, "Salad", 8.45);

        Menu menu = new Menu("Delicious Restaurant Menu");

        menu.addMenuItem(spaghetti);
        menu.addMenuItem(pizza);
        menu.addMenuItem(salad);
        System.out.println(menu);

        System.out.println("Printing all items");
        menu.printAllMenuItems();

        System.out.println("Printing Single Item");
        menu.printSingleMenuItem(pizza);

        System.out.println("Removing Item");
        menu.removeMenuItem(pizza);

        System.out.println("Printing all items");
        menu.printAllMenuItems();

        System.out.println("Trying to add the same menuitem again");
        menu.addMenuItem(spaghetti);
        MenuItem mixedCheese = new MenuItem(4, "It's a pizza, what else do you need?", 7.0, "dessert", false);
        menu.addMenuItem(mixedCheese);
        System.out.println("Menu is updated on " + menu.getLastMenuUpdatedDate());
        menu.printAllMenuItems();
    }
}
