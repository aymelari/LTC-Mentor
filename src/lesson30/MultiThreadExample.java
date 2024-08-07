package lesson30;

public class MultiThreadExample {
    public static void main(String[] args) {
        Number number = new Number();
        Letter letter = new Letter();


        Thread numberThread=new Thread(number);
        Thread letterThread=new Thread(letter);

        numberThread.start();
        letterThread.start();

    }
}
