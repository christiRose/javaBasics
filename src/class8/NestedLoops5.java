package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

       /*  1 2 3 4 5
           1 2 3 4 5
           1 2 3 4 5
        */
       /* for (int i = 0; i < 3; i++) { //executes the below codes 3times
            for (int j = 1; j <=5; j++) {
                System.out.print(j+" ");// prints the value of j from 1 to 5
            }
            System.out.println();
        */
        for (int i=1; i<=7; i++){

            for(int j=i; j<=7; j++){

                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
}
}