package lesson15.hw;

public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void decreaseQuantity(int quantity) throws OutOfStockException{
        if(getQuantity()<quantity){
            throw new OutOfStockException("not enough stock ");
        }
        else{
            this.quantity=getQuantity()-quantity;
        }
    }
}
