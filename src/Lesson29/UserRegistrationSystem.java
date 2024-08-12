package Lesson29;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserRegistrationSystem {
    static Set<User> set=new HashSet<>();



    public void registerUser(){
    Scanner scan=new Scanner(System.in);
        System.out.println("enter the name of the user");
        String name = scan.nextLine();
        System.out.println("enter the email of the user");
        String email = scan.nextLine();
        User user = new User(name, email);


            if (set.contains(user)) throw new DuplicateException(" user already exists");
            else {
                set.add(user);
                System.out.println("user added successfully");
            }

    }

    public void display(){
        if(set.isEmpty()){
            System.out.println("there is no registration");
        }else {
            System.out.println("list of users");
            for (User user : set) {
                System.out.println(user);
            }
        }
    }
}
