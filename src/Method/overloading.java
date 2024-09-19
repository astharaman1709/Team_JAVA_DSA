package Method;

public class overloading { //whwn two function have same name and return_type but different arguement and at compile time it decides which function is to run
    public static void main(String[] args) {
//        fun(17);
//        fun("Astha Raman");
        int ans = sum(7, 17, 77);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
