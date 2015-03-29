package sorting;

/**
 * Created by rrt on 3/28/2015.
 */
public class InsertionSort {

    public static void main(String [] args){

        int [] list = {6,3,8,4,1,5,0};
        int temp, cursor;
        for(int i=1; i<list.length; i++){
            cursor = i;
            for(int j=i-1; j>=0; j--){
                if(list[j]>list[cursor]){
                    temp = list[j];
                    list[j]=list[cursor];
                    list[cursor]=temp;
                }  //end of if

                cursor--;
            }  //Inner for loop end
        } //Outer for loop end

        for(int n=0; n<list.length; n++){
            System.out.println(list[n]);
        }


    }


}
