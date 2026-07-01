package Arrays;
import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr);


    }
}