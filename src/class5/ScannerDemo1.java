package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String [] args){


    /*
    Scanner => Name of the class
    scan =>is just a variable like we create primitive variables
    = => assign operator
    System.in => tells the computer we want to read the data from keyboard

     */

        Scanner scan=new Scanner(System.in); //can only used once for a lot of command

        /*System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight+" Kgs");

        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean(); // answerable by true or false only. not yes or no
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0); //only focus in 1 char be input (0,1,2,3,etc)
        System.out.println("Your gender is "+gender);
*/
        System.out.println("Please enter your name");
        String name=scan.next(); //when we have to take only one word as input
        System.out.println("Your name is "+name);

    scan.nextLine();  //trick to make nextLine method after we have used any other method from
        //Scanner class
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine(); // input the entire what you put inside console
        System.out.println("Your full name is "+fullName);

        scan.close();  //closing the program to free some space
                    //good practice
    }
}
