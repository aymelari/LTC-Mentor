package lesson14;

public class task2Main {
    public static void main(String[] args) throws InterruptedException {
    OddThread oddThread=new OddThread("odd");
    EvenThread evenThread=new EvenThread("even");

    oddThread.start();
    oddThread.join();
    evenThread.start();





    }
}
