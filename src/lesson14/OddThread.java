package lesson14;

public class OddThread extends Thread{
    String name;

    public OddThread(String name) {
        this.name = name;
    }

    public void run(){
        for(int i=1;i<10;i+=2){
            System.out.println(name + "is runnning" + i);
        }
    }


}
