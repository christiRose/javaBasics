package class7;
import java.util.Scanner;
public class DoWhileLoops {
    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=2E-UgePiOoo

       Scanner scanner=new Scanner(System.in);
        int number=0;
        do{
            System.out.println("Please enter a number");
            number=scanner.nextInt();
        }while (number!=5); //dowhileloops =your code are more readable

        System.out.println("*******");

        int number2=0;
        while(number2!=5) {
            System.out.println("Please enter a number:");
           number2 = scanner.nextInt();
        }


    }
}
