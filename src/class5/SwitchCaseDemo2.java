package class5;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

       //much easy way to do comparison than "else if"
        //switch case is the same thing as 'else if' method


            int day=3;
            switch (day){

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Wrong day");
            }

    }
}
