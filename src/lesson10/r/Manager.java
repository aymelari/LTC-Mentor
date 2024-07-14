package lesson10.r;

public class Manager extends Employee{
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void getDetils() {
        super.getDetils();
        System.out.println("teamsize is "+ this.teamSize);


    }

    @Override
    public void calculateBonus() {
        int bonus;
        if (teamSize>3){
            bonus=50;
        }
        else{  bonus=40;}

        super.calculateBonus();
        System.out.println("bonus is: ");
        System.out.println(bonus);
    }
}
