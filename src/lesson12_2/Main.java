package lesson12_2;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        Duck duck=new Duck();

        person.Swim();
        person.Walk();
        duck.Fly();
        duck.Walk();
        duck.Swim();
    }
}
