package FactorialException;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception {

        System.out.print("Введите число для рассчета факториала: ");
        Scanner in = new Scanner(System.in);

        try {
            int number = in.nextInt();
            int result = Factorial.getFactorial(number);
            System.out.printf("Факториал числа %d равен - %d", number, result);
        }catch(FactorialException ex){
            System.out.println(ex.getMessage());
            System.out.println("Прграмма завершает работу");
        }

    }

}

