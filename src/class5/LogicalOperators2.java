package class5;

public class LogicalOperators2 {
    public static void main(String [] args){

       //AND Operator
        //if both condition are true the results will be true (true&&true)
        //if one condition is false the result will be false  (true&&false)
        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;
        /*
        if the score is all the subj are greater than 90 print brilliant student
        otherwise print you need to work hard
         */

        if(mathScore>90){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("Brilliant student");
                }
            }
        }else{
            System.out.println("You need to work hard");
        }

    }
}
/*
        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("Brilliant student");
             }else{
            System.out.println("You need to work hard");
            }
 */