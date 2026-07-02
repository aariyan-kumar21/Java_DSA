package Sorting;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = {4,1,5,2,3};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Print the array
        for(int i = 0; i <= n-1; i++){
            System.out.print(arr[i]+" ");
        }  
    } 
}