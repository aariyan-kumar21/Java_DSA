package BinarySearchTree;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public static void main(String[]args) {
        int[] nums = {1,3,5,6,6,6,8};
        int target = 6;
        ArrayList<String> list = new ArrayList<>();
        int lo = 0; 
        int hi = nums.length - 1; 
        int idx1 = -1; 
        int idx2 = -1;

        while( lo<=hi ){
            int mid = (lo+hi)/2;
            if(nums[mid] < target) lo = mid + 1;
            else if (nums[mid ]> target) hi = mid - 1;
            else{
                idx1 = mid;
                hi = mid - 1;
            } 
        }

        lo = 0; 
        hi = nums.length - 1;
        while( lo<=hi ){
            int mid = (lo+hi)/2;
            if(nums[mid] < target) lo = mid + 1;
            else if (nums[mid ]> target) hi = mid - 1;
            else{
                idx2 = mid;
                lo = mid + 1;
            }
        }
    System.out.println(Arrays.toString(new int[]{idx1,idx2}));
   
    }
}