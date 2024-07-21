package lesson23;

import lesson18.Library;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Alphabet {
    public static void main(String[] args) {
        Alphabet alphabet=new Alphabet();

        List<Character> lowerCaseLetters=alphabet.generateLower();
        List<Character> upperCaseLetters=alphabet.generateUpper();

        List<String> merge = alphabet.merge(lowerCaseLetters, upperCaseLetters);
         merge.forEach(System.out::println);



    }
    public List<Character> generateLower(){
        List<Character> Letters=new LinkedList<>();
        for(char c='a';c<='z';c++){
            Letters.add(c);
        }return Letters;
    }

    public List<Character> generateUpper(){
        List<Character> Letters=new LinkedList<>();
        for(char c='A';c<='Z';c++){
            Letters.add(c);
        }return Letters;
    }


    public List<String> merge(List<Character> lower,List<Character> upper){
        List<String> merged=new ArrayList<>();
        for(int i=0;i<lower.size();i++){
            String letter=String.valueOf(lower.get(i));
            String letter2=String.valueOf(upper.get(i));
            String mergedLetters=letter.concat(letter2);
            merged.add(i,mergedLetters);


        }
        return merged;


    }


}
