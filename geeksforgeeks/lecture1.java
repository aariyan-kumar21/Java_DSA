// Basics java

package geeksforgeeks;
import java.util.Scanner;

public class lecture1{
    public static void main(String[] args){

    // volume of a sphere

        /*double r = 3;
        double v = (4.0 / 3.0)*3.14*r*r*r;
        System.out.println(v);*/

    // total surface area of a cubiod
        
        /*double length = 5.0;
        double breadth = 4.0;
        double height = 3.0;

        double TSA = 2.0 * ((length * breadth) + (breadth * height) + (height * length));
        System.out.println(TSA);*/

    // square of a number

        // Scanner sc = new Scanner(System.in);

        /*System.out.print("Enter a number :");
        int num = sc.nextInt();
        int square = num * num;
        System.out.print("Square of the number is :");
        System.out.println(square);*/

    // sum of 3 numbers

       /*Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number : ");
       int num1 = sc.nextInt();
       System.out.print("Enter second number : ");
       int num2 = sc.nextInt();
       System.out.print("Enter third number : ");
       int num3 = sc.nextInt();

       System.out.println(num1+num2+num3);*/

    // calculate simple interest   

       Scanner sc = new Scanner (System.in);

       System.out.print("Enter princple : ");
       double p = sc.nextDouble();
       System.out.print("Enter Rate of interest : ");
       double r = sc.nextDouble();
       System.out.print("Enter Time : ");
       double t = sc.nextDouble();

       double simple = p*r*t/100;
       System.out.print("The simple interest is : ");
       System.out.println(simple);

       sc.close();
    }
}