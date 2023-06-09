package org.bridgelabz;

/*Create a generic class that compares and identifies the maximum value
among three values of the same type. The class should handle different data types such as
integers, floats, or strings, demonstrating the versatility of generics in Java.

*/
public class Generics<Test extends Comparable<Test>> {
    Test x, y, z;  //Taking variables as three test cases

    Generics(Test x, Test y, Test z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Test maximum() {
        if (y.compareTo(x) > 0) {
            return y;
        } else if (y.compareTo(z) > 0) {
            return z;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        Generics compareInteger = new Generics(10, 20, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
        Generics comapreFloat = new Generics(-6, -4, -9);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
        Generics compareString = new Generics("Yogesh", "Ashwini", "Rajat");
        System.out.println("Maximum among three string is: " + compareString.maximum());
    }
}