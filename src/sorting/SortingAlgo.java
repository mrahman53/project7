package sorting;

/**
 * Created by rrt on 3/29/2015.
 */
public class SortingAlgo {
        int [] list;


    public int[] selectionSort(int [] array){
        int [] list = array;
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

        return list;
    }

    public int[] insertionSort(int [] array){
        int [] list = array;
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

        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        int temp;
        for (int cursor = list.length-1; cursor >= 0; cursor--) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                }
            }
        }

        return list;
    }

    public int [] mergeSort(int [] array){
        int [] list = array;
        mergeUnsortedNumbers(list);

        return list;
    }

    public void mergeUnsortedNumbers(int [] array){
        int [] list = array;
       if(list.length > 1){
           // divide array into 2 halves
           int [] left = lowerBoundary(array);
           int [] right = upperBoundary(array);
           mergeUnsortedNumbers(left);
           mergeUnsortedNumbers(right);
           merge(array,left, right);

       }
    }

    public int [] lowerBoundary(int [] array){
        int size = array.length/2;
        int [] left = new int[size];
        for(int i=0; i<left.length; i++){
            left[i] = array[i];
        }

        return left;
    }

    public int [] upperBoundary(int [] array){
        int size = array.length-array.length/2;
        int [] right = new int[size];
        for(int i=0; i<right.length; i++){
            right[i] = array[array.length/2+i];
        }

        return right;
    }

    public void merge(int [] result, int [] left, int [] right){

        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<result.length; i++){
            if(index2>=right.length || (index1<left.length&&left[index1] <= right[index2])){
                result[i] = left[index1];
                index1++;
            }else{
                result[i] = right[index2];
                index2++;
            }
        }


    }



    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
