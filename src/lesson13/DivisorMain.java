package lesson13;

import java.util.Scanner;

public class DivisorMain {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner=new Scanner(System.in);
        int cavab=scanner.nextInt();
        int cavab2=scanner.nextInt();

        Division division=new Division();
        try{
            division.divideNumbers(cavab,cavab2);
        }
        catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }

    }
}
