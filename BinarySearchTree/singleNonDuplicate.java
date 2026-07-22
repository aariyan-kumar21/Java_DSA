package BinarySearchTree;

public class singleNonDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4,5,5};
        int n = nums.length;
        if(n==1) 
        if(nums[0] != nums[1]) System.out.println(nums[0]);
        if(nums[n-1] != nums[n-2]) System.out.println(nums[n-1]);

        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) System.out.println(nums[mid]); 

            int f = mid, s = mid;
            if(nums[mid-1] == nums[mid]) f = mid - 1;
            else s = mid + 1;
            
            int leftcount = f - lo;
            int rightcount = s - hi;
            if(leftcount%2==0) lo = s + 1;
            else hi = f - 1;
        }
    }
}