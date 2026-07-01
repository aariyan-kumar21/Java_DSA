import java.util.Scanner;

public class loops{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        //Boolean composite = false;

    // Check weather the number is prime or composite 

        /*if( num > 1){
            for (int i = 2;i<num;i++){
                if(num % i == 0){
                    composite = true;
                    break;
                }
            }
        }
        if(composite){
            System.out.println(num + " is a composite number.");
        }
        else{
            System.out.println(num + " is a prime number.");
        }*/

    // count the number of digits in a number
        /*int count = 0 ;
        while (num != 0){
            num = num / 10;
            count = count + 1;
        }
        System.out.println(count);*/

    // sum of digits of a number
    
        /*int sum = 0;
        while ( num !=0 ){
            sum = sum + ( num % 10);
            num = num / 10;
        }
        System.out.println(sum);*/

    // reverse of number
    
        int reverse = 0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num / 10;
        }
        System.out.println(reverse);

        sc.close();
    }
}