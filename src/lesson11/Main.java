package lesson11;

public class Main {

    public static void main(String[] args) {
         Calculator calculator=new Calculator();
         ScientificCalculator scientificCalculator=new ScientificCalculator();

        System.out.println(calculator.add(5,4));
        System.out.println(calculator.add(3.5,5.6));
        System.out.println(calculator.add(5,6,7));
        System.out.println(scientificCalculator.power(4,5));
    }

    }

