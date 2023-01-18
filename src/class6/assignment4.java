package class6;

public class assignment4 {
    public static void main(String[] args) {
/*

Print even numbers from 20 to 1 (2 ways)

*/
        System.out.println("Option #1");

        int number = 20;
        while (number >= 1) {
            if (number % 2 == 0)
                System.out.println(number);
            number--;


            System.out.println("Option #2");
            int number2 = 20;
            while (number2 > 1) {
                System.out.println(number2);
                number2 -= 2;
            }


        }
    }

}





