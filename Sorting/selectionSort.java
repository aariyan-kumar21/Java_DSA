package Sorting;

public class selectionSort{
    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 3, 2};
        int n = arr.length;

        for(int i=0; i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

        // swaping
        int temp =arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex] = temp;
        }

        // printing the array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}