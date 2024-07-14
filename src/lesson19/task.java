package lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Map<String,String>  contacts =new HashMap<>();


        Scanner scanner=new Scanner(System.in);
         String answer;
        do {
            System.out.println("enter the operation");
            answer = scanner.nextLine();
            if (answer.equals("add")) {
                System.out.println("enter the name and number");
                String contactname = scanner.nextLine();
                String contactNumber = scanner.nextLine();
                if(contacts.containsKey(contactname)){
                    System.out.println("contact already exists" );
                }
                else{
                    contacts.put(contactname,contactNumber);
                }
            } else if (answer.equals("remove")) {
                System.out.println("enter the name you want to remove");
                String contactname = scanner.nextLine();
                contacts.remove(contactname);


            } else if (answer.equals("search")) {
                System.out.println("enter the name you wanst to search :");
                String contactname = scanner.nextLine();
                if(contacts.containsKey(contactname)){
                    System.out.println(contacts.get(contactname));
                }
                else {
                    System.out.println("there is no such contact exists");
                }

            }

            else if(answer.equals("display")){
                for(Map.Entry<String,String> entry : contacts.entrySet()){
                    System.out.println(entry.getKey() + ":" + entry.getValue());
                }
            }

        }while(!answer.equals("stop"));

    }
}
