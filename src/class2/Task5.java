package class2;

public class Task5 {
    public static void main(String[] args) {
/*5) Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say. “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0
*/
        int W=5;
        int H=8;
        int A=W*H;
        int P=2*W+2*H;

        System.out.println("The perimeter of a rectangle with width "+ W +" and height "+H+" is equal to "+P+" and the area is "+A);

        System.out.println("**********");
        //prof ans
        double width=5; //use double coz they used decimal in question
        double height=8;
        System.out.println(width+height);
        System.out.println(2*(width+height));// () if we those calculation get priority


    }
}
