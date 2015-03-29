package sorting;

import java.util.List;

/**
 * Created by rrt on 3/28/2015.
 */
public class BubbleSort {

    public static void main(String [] args) {
        int[] list = {6, 3, 8, 1, 5, 7, 0, 2};
        int temp;
        for (int cursor = list.length-1; cursor >= 0; cursor--) {
            for (int i = 0; i < list.length-1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                }
            }
        }

        for (int n = 0; n < list.length; n++) {
            System.out.println(list[n]);
        }
    }
}
