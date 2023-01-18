package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("**********LOGICAL  AND*********");
        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = true;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case failed");
        }

       /* boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = false;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case failed");

        */
        System.out.println("**********LOGICAL  OR*********");

        boolean dashboard=false;
        String message="Welcome admin";

        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("**********LOGICAL  NOT*********");

    boolean b=true;
        System.out.println(!true);
    }
}
//discontinue T 00:39:03