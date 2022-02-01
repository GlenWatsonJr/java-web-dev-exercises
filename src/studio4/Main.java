package studio4;

public class Main {
    public static void main(String[] args){

        Menu Pizza = new Menu();

        MenuItem pepperoni = new MenuItem("Pepperoni Pizza","A large Pepperoni Pizza", 12.99, "Main Course");
        MenuItem cheese = new MenuItem("Cheese Pizza","A large Cheese Pizza", 10.99, "Main Course");
        MenuItem breadSticks = new MenuItem("Bread Sticks","A side of bread sticks", 5.99, "Side");
        MenuItem salad = new MenuItem("Caesar Salad","A side of caesar salad", 4.99, "Side");
        MenuItem pepsi = new MenuItem("Pepsi","Pepsi fountain drink", 1.99, "Beverage");
        MenuItem mtdew = new MenuItem("Mtn Dew","Mtn Dew fountain drink", 1.99, "Beverage");

        Pizza.addMenuItem(pepperoni);
        Pizza.addMenuItem(cheese);
        Pizza.addMenuItem(breadSticks);
        Pizza.addMenuItem(salad);
        Pizza.addMenuItem(pepsi);
        Pizza.addMenuItem(mtdew);

        //System.out.println(Pizza.getMenu().get(2).getName() + " - " + Pizza.getMenu().get(2).getPrice() + " - " + Pizza.getMenu().get(2).getDesc());

        //printMenu(Pizza);

        //printSingleItem(Pizza, 3);

        //isEquals(Pizza.getMenu().get(1), Pizza.getMenu().get(1));

        //System.out.println("Updated Date: " + Pizza.getUpdateDate());

        itemIsNew(Pizza, 2);
    }
    public static void printMenu(Menu menu){
        System.out.println("Menu:");
        for (MenuItem item : menu.getMenu()){
            System.out.println(item.getName() + " - " + item.getPrice() + " - " + item.getDesc());
        }
    }

    public static void printSingleItem(Menu menu, int index){
        System.out.println(menu.getMenu().get(index).getName() + " - " + menu.getMenu().get(index).getPrice() + " - " + menu.getMenu().get(index).getDesc());
    }

    public static void isEquals(MenuItem item1, MenuItem item2){
        System.out.println(item1.equals(item2));
    }

    public static void itemIsNew(Menu menu, int index){
        System.out.println("Is " + menu.getMenu().get(index).getName() + " new: " + menu.getMenu().get(index).getNew());
    }

}
