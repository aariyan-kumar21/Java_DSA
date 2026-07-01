package Arrays;
import java.util.Scanner;
public class largest_num {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        // input for array
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // To find the largest number
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.print("The largest number is " +max);
        
        sc.close();
    }
    
}