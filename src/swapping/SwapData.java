package swapping;

/**
 * Created by rrt on 3/28/2015.
 */
public class SwapData {

    public static void main(String [] args){

        int value1 = 5;
        int value2 = 10;
        int temp;

        System.out.println("before swapping value1 : "+value1);
        System.out.println("before swapping value2 : "+value2);
        temp = value1;
        value1 = 10;
        value2 = temp;
        System.out.println("after swapping value1 : "+value1);
        System.out.println("after swapping value2 : "+value2);
    }



}
