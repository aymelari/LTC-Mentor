package lesson30;

public class Number implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try{
            Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(" Number sleep");
            }
        }
    }
}
