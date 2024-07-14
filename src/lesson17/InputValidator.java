package lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public void isValid(String input){
        Pattern stringPattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = stringPattern.matcher(input);
        Pattern intPattern = Pattern.compile("^\\d+$");
        Matcher matcher2 = intPattern.matcher(input);// Digits only
        Pattern specialCharPattern =Pattern.compile ("^[^a-zA-Z\\d]+$");
        Matcher matcher3 = specialCharPattern.matcher(input);

if(stringPattern.matcher(input).matches()){
    System.out.println("the element is  " + InputCategory.TEXT.value);}
else if(intPattern.matcher(input).matches()){
     System.out.println("the element is  " + InputCategory.NUMBER.value);}
else if(specialCharPattern.matcher(input).matches()){
            System.out.println("the element is  " + InputCategory.SPECIAL_CARACTER.value);}
}}
