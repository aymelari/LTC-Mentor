import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        SlotMachine machine1=new SlotMachine();
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many times do you want to lever?");
        int cavabsay= scanner.nextInt();


        int budget =scanner.nextInt();

         for(int i=0;i<cavabsay-1;i++) {
             if( !(SlotMachine.credit==0)){

             System.out.println("DO YOU WANT TO PULL(p) LEVER OR EXIT(e)");
             String cavab= scanner.next();
             if (cavab.equals("p") ) {
                 machine1.pullLever();

             } else {
                 System.out.println(" you have  exit the game");
             }

         } else{
                 System.out.println("YOU RAN OUT OF CREDITS");
             }
         }








    }

}
