package class6;

public class WhileLoop5 {
    public static void main(String[] args) {

  int number=1;
  boolean flag=true;
  while (flag){
      System.out.println(number);
      if(number>3){
          flag=false;
      }
      number++;
  }
    }
}

// while (true){   //the moment there's a false here it will stop executing
//    System.out.println("Hello World");  //it will print non-stop(infinite).

