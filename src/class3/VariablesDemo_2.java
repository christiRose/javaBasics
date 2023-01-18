package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
       /*
       to rename something rightclick - refractor-rename
        */

        int age=10;
        System.out.println(age);

        age=20;
        System.out.println(age);

        int number=10;
        age=number; //i am saying to java replace the value of age with the value of number variable
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }

//renaming variable that used in multiple places by clicking the main variable,right click=refractor and all the variables will change
}
