package lesson15.hw;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Item item1=new Item("ciyelek",10);
        Item item2=new Item("albali",15);

        ShoppingCart cart1=new ShoppingCart();

        cart1.addItem(item1);
        cart1.addItem(item2);




        cart1.purchaseItem("ciyelek",2);
        //cart2.purchaseItem(item2.getName(), 3);


    }
}
