import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    String[] SYMBOLS = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    static int credit=3;




    public String pullLever(){
        Random random = new Random();
        int a = random.nextInt(0, 6);
        int b = random.nextInt(0, 6);
        int c = random.nextInt(0, 6);
        System.out.println(SYMBOLS[a] + SYMBOLS[b] + SYMBOLS[c]);
        if(a==b || b==c || a==c)
        {


               System.out.println("YOU WON");
           } else {
               System.out.println("YOU LOST");
               credit--;

           }



        return SYMBOLS[a]+SYMBOLS[b]+SYMBOLS[b];
    }


}
