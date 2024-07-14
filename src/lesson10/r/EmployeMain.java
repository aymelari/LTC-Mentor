package lesson10.r;

public class EmployeMain {
    public static void main(String[] args) {

        Manager manager=new Manager("ali",670,5);
        Director director=new Director("sema",1200,6,45);

        manager.getDetils();
        manager.calculateBonus();
        director.getDetils();
        director.calculateBonus();

    }
}
