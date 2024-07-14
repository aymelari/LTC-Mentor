package lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        List<String> playlist=new LinkedList<>();

        Scanner scanner=new Scanner(System.in);

        String answer;
        do{ System.out.println("enter the operatn you want to perform");
            System.out.println("ADD(a) REMOVE(r) DISPLAY(d)");
            answer= scanner.nextLine();
            if(answer.equals("a")){
                System.out.println("enter the song name ");
                String answer2=scanner.nextLine();
                playlist.add(answer2);
            }
            else if(answer.equals("r")){
                System.out.println("enter the song name you want to remove ");
                String a=scanner.nextLine();
               boolean removal= playlist.remove(a);
            }
            else if(answer.equals("d")){
               for(String song : playlist){
                   System.out.println(song);
               }

            }

        }while(!answer.equals("4"));





    }
}
