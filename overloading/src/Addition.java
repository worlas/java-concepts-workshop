/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Result From Double Int Parameter: " + result);
    }

    public void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Result From Triple Int Parameter: " + result);
    }

    public void add(int a, int b, float c) {
        float result = a + b + c;
        System.out.println("Result From Double Int, Single Float Parameter: " + result);
    }
}

