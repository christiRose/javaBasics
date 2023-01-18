package class6;

import java.util.Scanner;
public class LogicalOrDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter the day");
        Scanner scan=new Scanner(System.in);
        String day=scan.next();

        if(day.equals("Monday")||day.equals("Friday")) {//if you use (day.equalsIgnoreCase= you can use lowercase ex. ("monday"))
            System.out.println("No Class today");
        }else if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("Java class Enjoy");
        }else if (day.equals("Wednesday")||day.equals("Tuesday")){
            System.out.println("Manual Testing class");
        } else if (day.equals("Thursday")) {
            System.out.println("Review class");
        }else {
            System.out.println("Wrong day entered");
        }
scan.close();
        }
        }



