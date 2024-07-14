package lesson16;

import java.util.Random;

public class Password {
    public StringBuilder generateRandomPassword(int length){
        Random random=new Random();
        StringBuilder password=new StringBuilder();
        String all="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


        for(int i=0;i<=length;i++){
            char s1=all.charAt(random.nextInt(all.length()));
            password.append(s1);
        }

       return password;


    }
}
