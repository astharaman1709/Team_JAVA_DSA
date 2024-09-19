package Method;

import java.util.Arrays;

public class change {
    public static void main(String[] args) {
        // create an array
        int[] arr = {17, 23, 27, 85, 19};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] nums) {
        nums[0] = 100;
        //pass by value of the copy of the reference not pass by value only
        // if you make a change to the object via this reference variable, same object will be changed
    }
}
