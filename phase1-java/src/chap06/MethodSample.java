package chap06;

public class MethodSample {

    public static void main(String[] args) {
        greet();
        greet();

        greetTo("田中");
        greetTo("鈴木");

        int result = add(3, 5);
        System.out.println(result);
        System.out.println(add(10, 20));
    }

    static void greet() {
        System.out.println("こんにちは");
    }

    static void greetTo(String name) {
        System.out.println("こんにちは、" + name + "さん");
    }

    static int add(int a, int b) {
        return a + b;
    }
}