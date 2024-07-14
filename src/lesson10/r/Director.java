package lesson10.r;

public class Director extends Manager{
    int StockOptions;

    public Director(String name, double salary, int teamSize, int stockOptions) {
        super(name, salary, teamSize);
        StockOptions = stockOptions;
    }


    @Override
    public void getDetils() {

        super.getDetils();
        System.out.println("stock options : " + this.StockOptions);
    }

    @Override
    public void calculateBonus() {


        if(StockOptions>20){

            super.calculateBonus();
            System.out.println(" + vip bonus");

        }
    }
}
