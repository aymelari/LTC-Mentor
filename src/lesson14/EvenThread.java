package lesson14;

public class EvenThread extends Thread {

        String name;

        public EvenThread(String name) {
            this.name = name;
        }

        public void run(){
            for(int i=0;i<10;i+=2){
                System.out.println(name + "is runnning" + i);
            }
        }


    }


