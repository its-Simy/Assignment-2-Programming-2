public class Main {
    public static void main(String[] args) {

        //Write a simple program that will show the count of the number of objects using the static data member.
        //was originally was supposed to be to name fruits but ended up becoming better just to make the program more
        //generalized

        fruit one = new fruit();
        one.name_fruit();

        // repeating the same object to see if the object count changes
        one.name_fruit();


        //the following updates the object count to 2
        fruit two = new fruit();
        two.name_fruit();








    }
}
