package Pattern_Printing;
import java.util.Scanner;

public class floyeds{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n in odd : ");
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(count++ + " ");
            }
  
        System.out.println();    
        }
    sc.close();    
    }
}