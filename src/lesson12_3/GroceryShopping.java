package lesson12_3;

public class GroceryShopping {


        Product[] shoppingList;
    int i=0;

    public GroceryShopping(int say) {
       shoppingList= new Product[say];
    }

    public void  addProduct(Product product){
           shoppingList[i]=product;
           i++;
        }

        public void calculateTotalCost(){
            double cost=0;
            for(int j=0;j<3;j++){
                 cost=cost+ shoppingList[j].getCost();

            }
            System.out.println(cost);
        }
    public void printReceipt(){
        for(int j=0;j<3;j++){
            System.out.println(shoppingList[j]);


        }


    }


}
