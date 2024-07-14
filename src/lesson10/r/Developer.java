package lesson10.r;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void getDetils() {
        super.getDetils();
        System.out.println(this.programmingLanguage);
    }
}
