package Method;

import java.util.Arrays;

public class arguement {
    public static void main(String[] args) {
//        fun();
//        multiple(17, 09, "Astha", "Arya", "dywehfvew");//order of arguement must be same as in declaration
//        demo();
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    //mixed arguement
    static void multiple(int a, int b, String ...v) {  //variable length arguement always come at the end

    }
//var agr parameter cannot be empty
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
