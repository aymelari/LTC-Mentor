package lesson12_2;

public class Duck implements Fly,Walk,Swim{
    @Override
    public void Fly() {
        System.out.println("can fly");
    }

    @Override
    public void Walk() {
        System.out.println("can walk");
    }

    @Override
    public void Swim() {
        System.out.println("can swim");
    }
}
