package practiceForRep;

import java.util.Scanner;

public class hW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = scanner.nextInt();

        if ((number%3)==0) {
            System.out.println("Value is odd");
        }if((number%2)==0) {
            System.out.println("Value is even");
        } if ((number%3)> 1000) {
                System.out.println("Odd number is large");
            }else{
                System.out.println("Even number is large");
            }if ((number%3)> 1000){
            System.out.println("Odd value is just right");
        }else{
            System.out.println("Even value is just right");
        }
        }
    }


