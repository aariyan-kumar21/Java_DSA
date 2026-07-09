package BinarySearchTree;

public class basicSearching{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 4;
        
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int mid = -1;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(arr[mid]==target) break;
            else if(arr[mid]<target) lo = mid+1;
            else hi = mid - 1;
        }
        System.out.println(mid);
    }
}