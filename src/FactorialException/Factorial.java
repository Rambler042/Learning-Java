package FactorialException;

public class Factorial  {

    public static int getFactorial(int num) throws FactorialException{
        if(num < 1){
            throw new FactorialException("Число не должно быть меньше 1");
        }
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

}
