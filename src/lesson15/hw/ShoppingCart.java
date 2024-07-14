package lesson15.hw;

public class ShoppingCart {
    private Item[] items=new Item[2];
    static int i=0;
    public void addItem(Item item){
        items[i]=item;
        i++;
    }
    public void purchaseItem(String name,int quantity){
        for(Item item : items){

            try {
                if(item.getName().equals(name)){
                    item.decreaseQuantity(quantity);
                    System.out.println("item purchased ");
                }
            }catch (OutOfStockException e){
                System.out.println("Not enough stock");
            }


        }

    }
}
