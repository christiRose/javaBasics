package class7;
import java.util.Scanner;

public class DoWhileLoops2 {
    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=2E-UgePiOoo

     /*enter a number between 1 and 10: -11
     enter a number between 1 and 10: 20
     enter a number between 1 and 10: 3
     3 is between 1 and 10
      */
 Scanner scan=new Scanner (System.in);

 int n;
 do{
     System.out.print("enter a number between 1 and 10: ");
     n=scan.nextInt();
 }while (n<1 || n>10);
        System.out.println(n+" is between 1 and 10");
    }
}
