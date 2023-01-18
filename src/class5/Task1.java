package class5;

import java.util.Scanner;
public class Task1 {
    public static void main(String [] args){
        /*
        Write a program to find the largest number among three distinct using nested if condition
        Please use Scanner class to take input from users
         */



   Scanner scanner=new Scanner(System.in);
        Double number1,number2,number3;
        System.out.println("Please enter 3 numbers");
        number1=scanner.nextDouble();
        number2=scanner.nextDouble();
        number3=scanner.nextDouble();




        if(number1>number2){
        if(number1>number3) {
            System.out.println("Number 1 is the Largest "+ number1);
        }
    }
    if (number2>number1){
        if(number2>number3){
            System.out.println("Number 2 is the Largest "+number2);
        }
    }
    if(number3>number1){
        if(number3>number2){
            System.out.println("Number 3 is the Largest "+number3);
        }
    }

    }
}
