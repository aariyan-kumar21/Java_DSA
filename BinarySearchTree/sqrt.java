package BinarySearchTree;

public class sqrt{
    public static void main(String[] args) {

        int x = 20;

        if (x == 0) {
            System.out.println(0);
            return;
        }

        int lo = 1; int hi = x;
        while(lo<=hi){
            if (x == 0) break;
            int mid = lo+(hi-lo)/2;
            if (mid == x / mid)  ;
            else if (mid>x/mid) hi = mid - 1;
            else lo = mid+1;
        }
        System.out.println(x);
    }
}