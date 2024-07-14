package lesson12;

public class Plane implements Transport,Flyable{
    int capacity;
    String destination;

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String setDestination(String destination) {
        this.destination=destination;
        return this.destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void takeOff() {
        System.out.println("took off");
    }

    @Override
    public void land() {
        System.out.println("landed");
    }
}
