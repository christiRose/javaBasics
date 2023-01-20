package class8;

public class BreakKeyWordDemo2 {
    public static void main(String[] args) {

        //if else with no break sample
        int temp=75;

        while (temp<=105){
            if (temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else{
                System.out.println("Its very hot "+temp);

            }
            temp+=5;
        }
    }
}
