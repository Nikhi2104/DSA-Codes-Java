import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class bit_manipulationpq {
    public static void main(String args[]) { // 100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        // swapping two numbers without using 3rd variable
        // a=a+b; // 1st approach
        // b=a-b;
        // a=a-b;

        a = a ^ b;
        b = a ^ b; // 2nd approach using XOR operator
        a = a ^ b;

        System.out.println("After swapping: " + "a=" + a + " , " + "b=" + b);
    }
}






