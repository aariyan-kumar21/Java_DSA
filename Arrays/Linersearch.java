package Arrays;

public class Linersearch {
    public static void main (String[] args){

        int []arr = {12,327,53,18,62,88,6,53};
        int target = 9;

        boolean flag = false;
        for(int i =1;i<arr.length;i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }

        if(flag==true)  {
            System.out.println("Taget number was found in this array.");
        }    
        else {
            System.out.println("Target doesn't exist in this array.");
        }
    } 
}    