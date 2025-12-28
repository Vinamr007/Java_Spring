package day2;

public class method {
    public method() {
    }

    public static void main(String[] var0) {
        sayhello("vinu");
        System.out.println("the sum is " + add(5, 10));
    }

    private static void sayhello(String var0) {
        System.out.println("hello " + var0);
        System.out.println("welcome to methods in java");
    }

    private static int add(int var0, int var1) {
        return var0 + var1;
    }
}