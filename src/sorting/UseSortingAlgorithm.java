package sorting;

/**
 * Created by rrt on 3/29/2015.
 */
public class UseSortingAlgorithm {

    public static void main(String [] args){
        int [] array1 = {6,3,9,7,1,2,5,0};
        int [] array2 = {100,56,90,3,76,4,1,34,89,0,5,8,39};
        int [] array3 = {99,45,78,4,98,2,54,1,3,9,7,10,20,5,0};
        SortingAlgo sort = new SortingAlgo();
        sort.bubbleSort(array1);
        sort.insertionSort(array2);
        sort.selectionSort(array3);
        System.out.println("Array1 using bubble sort : ");
        SortingAlgo.printSortedArray(array1);
        System.out.println("Array2 using Insertion sort: ");
        SortingAlgo.printSortedArray(array2);
        System.out.println("Array3 using Selection sort: ");
        SortingAlgo.printSortedArray(array3);

        sort.mergeSort(array1);
        sort.printSortedArray(array1);

    }
}
