package lesson12_2;

public class Person implements Swim,Walk{
    @Override
    public void Swim() {
        System.out.println("can swim");
    }

    @Override
    public void Walk() {
        System.out.println("can walk");
    }
}
