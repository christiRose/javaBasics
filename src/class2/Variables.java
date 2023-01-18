package class2;

public class Variables {
    public static void main(String[] args) {
/*
below ;one is reserving a box in the computers memory
we are calling it box1 if we need the info that we are storing inside this box
we can simple say to the computer give us the contents of box1
int->what type of data we want to store
box1-> is the name of the box
= sign will take whatever we write after it and store it inside the box1
10-> is what we are storing inside the box
 */
        int box1=10;
        System.out.println(box1);
        System.out.println("box1");
        /*to store whole numbers(# without decimals points) we have 4 diff types of boxes.
         for example numbers like 10 20 3000 1000000 330000
 1. byte-small amount until 127 2. short 3. int 4. long

*/
        byte box2=127; //range for byte is from -128 to 127 if we need to store larger number we should try short number
        short box4=32767;
        int biggerBox=123456784;//most common type of box (datatye)
        long maxBox=12334545567844L;

        short myBox=10000;
        System.out.println(myBox);
    }
}
