package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5,9,7,3,1,5,6,7,4,12};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] quickSort(int [] array){
        sort(array,0,array.length-1);
        return array;
    }

    private static void sort(int[] array, int low, int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int temp = array[low];
        while (low<high){
            while (low<high&&array[high]>temp){
                high--;
            }
            array[low] = array[high];
            while (low<high&&array[low]<=temp){
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        sort(array,start,low-1);
        sort(array,low+1,end);
    }


}
