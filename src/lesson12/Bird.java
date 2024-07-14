package lesson12;

public class Bird implements Animal,Flyable{
    String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String makeSound() {
        return "cikcik";
    }

    @Override
    public void takeOff() {
        System.out.println("took off");
    }

    @Override
    public void land() {
        System.out.println("landed");
    }
}
