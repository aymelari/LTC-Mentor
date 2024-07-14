package lesson13;

public class Division {
    public double divideNumbers(int a, int b) throws DivisionByZeroException{
        if(b==0) { throw new DivisionByZeroException("0-a bolme yoxdur");}
        else{
       return a/b;}



    }
}
