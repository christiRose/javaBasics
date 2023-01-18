package class5;
import java.util.Scanner;
public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        //switch case statement using char data type


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Gender m f");
        char gender=scanner.next().charAt(0);

            switch (gender){

                case 'F':
                    System.out.println("Female");
                    break;
                case 'm': //without using break between output it will print the next until it reach break
                case 'M':
                    System.out.println("Male");
                    break;
                default:
                    System.out.println("not specified");
            }

    }
}
