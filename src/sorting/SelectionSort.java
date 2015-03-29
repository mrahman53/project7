package sorting;

/**
 * Created by rrt on 3/28/2015.
 */
public class SelectionSort {
    public static void main(String [] args){
        int [] list = {6,3,8,9,1,5,4};
        int temp;
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++) {
                if (list[i] > list[j]) {
                    temp=list[j];
                    list[j]=list[i];
                    list[i]=temp;
                }
            }
        }

        for(int n=0; n<list.length; n++){
            System.out.println(list[n]);
        }
    }
}
