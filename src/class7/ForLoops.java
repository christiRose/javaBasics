package class7;

public class ForLoops {
    public static void main(String[] args) {
        /*
        prints number from 0 to 9
         */

      /*  int number=0;
        while (number<10){//checks the condition
            System.out.println(number);
            number++;
        }

        //initialize, condition, incrementORdecrement

        for (int i=0;i<10;i++){
        System.out.println(i);
        }
//using a for loop print odd number from 1 to 20;


       */

        for (int n=1;n<=20;n+=2){
            System.out.println(n);

            /*
            PROF ANSWER
            for (int i=1;i<20;i+=2){
            if (i%2!=0){// checking if a number is odd number
           System.out.println(i);
            }

            for (int i=1;i<20;i+=2){
            System.out.println(i);
            }

             */
        }
    }
}
