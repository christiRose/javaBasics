package class6;

public class assignment {
    public static void main(String[] args) {

  /*Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off anymore”
   */
        boolean workDay = true;
        int day = 1;
        while (workDay){
            System.out.println("I need a day off");
            day++;
            if (day>=6) {
                System.out.println("I do not need a day off anymore");
        workDay=false;

            }

        }


        }
        /*
        boolean workDay=true;
        int day=1;
        while (workDay){
        if (day<=50){
        System.out.println("I need a day off);
        }else{
        System.out.println("I do not need a day off anymore");
        workDay=false;
        }
        day++;   //it is equal to day=day+1, day+=1
        }
        }
        }

         */
    }

