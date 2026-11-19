package chap03;

public class StringConpareSample {

    public static void main(String[] args) {
        String input = "abcdef".substring(0, 3);
        
        System.out.println(input);
        System.out.println(input == "abc");
        System.out.println(input.equals("abc"));
    }

}
