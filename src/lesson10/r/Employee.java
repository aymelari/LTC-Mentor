package lesson10.r;

public class Employee {
    String name;
    double salary;

    public Employee(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }

    public void getDetils(){
        System.out.println("name : " +this.name);
        System.out.println("salary : " + this.salary);
    }

    public void calculateBonus(){
        System.out.println(" ");

    }
}
