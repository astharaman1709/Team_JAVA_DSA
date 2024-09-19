package Method;

public class shadow {

    static void fun() {
        System.out.println(x);
    }
    static int x = 17; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 17
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 7;
        System.out.println(x); // 7
        fun();
    }
//shadow effect does not work in methods

}
