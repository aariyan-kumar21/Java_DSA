package BinarySearchTree;

public class firstOccurrence {
    public static void main(String[]args){
        int[] arr = {1,2,3,3,4,5};
        int target = 3;
        int lo = 0;int hi = arr.length - 1;int idx = -1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]>target) hi = mid - 1;
            else if (arr[mid]<target) lo = mid + 1;
            else{
                idx = mid;
                hi = mid - 1;
            }
        }
        System.out.println(idx);
    }
}