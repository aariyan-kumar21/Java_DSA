package Sorting;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = {4,1,3,5,2};
        int n = arr.length;

        // Bubble sort optimised
        for(int i = 0; i < n - 1; i++){

            /*boolean isSorted = true;
            for(int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
 
            if(isSorted == true) break;*/
            int swaps = 0 ; // easier method
            for(int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }

        // Print the array
        for(int i = 0; i <= n-1; i++){
            System.out.print(arr[i]+" ");
        }  
    } 
}