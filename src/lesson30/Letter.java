package lesson30;

public class Letter implements Runnable{
    @Override
    public void run() {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println(letter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Letter sleep");
            }
        }

    }}