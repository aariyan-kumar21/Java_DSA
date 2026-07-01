import java.util.Scanner;

public class if_else {
    /* public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

    // Check weather the number is divisible by 5 or not    

        if ( num % 5 == 0){
            System.out.println("The number is divisible by 5.");
        }
        else{
            System.out.println("The number can't be divisible by 5.");
        }
        
    // Print the absolute value of a number    

        if( num >= 0){
            System.out.println(num);
        }
        else{
            System.out.println(-num);
        } */
    
    // Check isInteger or not        
        public static void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number : ");
            double num = sc.nextDouble();
            int x = (int)num;
            
            if ( num - x == 0 ){
                System.out.println("It is a integer");
            }
            else{
                System.out.println("It is not a integer.");
            }

            sc.close();
        }   

        
}