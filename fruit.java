import java.util.Scanner;

public class fruit {
    private String fruit;
    private static int counter = 0;
    //declared both the string and the int as privates so they are not accessed

    //created r
    fruit(){
       fruit = "";
        counter++;

    }

    //since i don't want the method to return something, i made it a void
    public void name_fruit(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Type something in: ");
        fruit = scnr.nextLine();
        System.out.println();
        System.out.println("This is what you typed in: " + fruit);
        System.out.println("The current object count is " + counter);
    }


}
