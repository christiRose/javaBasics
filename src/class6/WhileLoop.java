package class6;

public class WhileLoop {
    public static void main(String[] args) {



        int number=0;
        if(number<3){
            System.out.println("Hello World");
        }
        System.out.println("***");

         number++;
        if(number<3){
            System.out.println("Hello World");
        }
        number++;
        if(number<3){
            System.out.println("Hello World");
        }

        //try exact same thing with the whileLoop

        int number2=0;
        while (number2<3){  //repeating x3. if you put true instead of 3 it will be infinite
            System.out.println("Hello World");
            number2++;
        }
    }
}
