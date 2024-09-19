package Method;

import java.util.Scanner;

public class StringType {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = in.next();
        String name = myGreet(inputName);
        System.out.println(name);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
