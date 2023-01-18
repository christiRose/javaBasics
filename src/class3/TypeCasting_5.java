package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;// to tell java long box can fit to smaller box
        //typecasting fix the values from diff type of boxes and can fix those to diff types of boxes. conversion of 1 data type to another 1

        float f=10.5f;//java cant print the decimal
        int num=(int)f;//forcing java to do computing
        System.out.println(shorterNumber);
        System.out.println(num);

        /* small to bigger box
        byte
        short
        int
        long
        float
        double
        if we try to store the contents from a smaller box to a larger box, java doesn't complain coz
        the content can easily fit inside the larger box but if we try the otherway around we get
         *typecasting(conversion) not always use
         */
        byte b=10;
        int number2=b;
        short c=(short)number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);

        /*
        System.out.println((char)128516);//every char has a number representation
        System.out.println((char)97);

        OTHER TOPIC!
         */

    }
}
