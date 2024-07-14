package lesson10.r;

public class DeveloperMain {
    public static void main(String[] args) {
        Employee employee=new Employee("aysu",315.5);
        Developer developer=new Developer("eli",560.4,"java");
        Manager manager=new Manager("sema",810,4);
        employee.getDetils();
        developer.getDetils();
        manager.getDetils();
    }
}
