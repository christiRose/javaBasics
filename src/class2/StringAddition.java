package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";

        /*
        java executes code from top to buttom but if we have operations on the same lines it
        executes from left to right
         */

        System.out.println(firstName+" "+lastName);
        //to add space just +" "+
        //you can put anything inside the ""
        System.out.println("First name="+firstName);
        System.out.println("Last name="+lastName);
        System.out.println("10"+"10");

        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);

        //+ctrl Z to undo the line
    }
}
