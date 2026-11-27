package chap12;

public class StringBuilderSample {

    public static void main(String[] args) {
        String[] names = {"田中", "鈴木", "佐藤"};
        
        StringBuilder builder = new StringBuilder();
        for (String name : names) {
            builder.append(name);
            builder.append("さん、");
        }
        builder.append("こんにちは");
        
        String message = builder.toString();
        System.out.println(message);

    }

}
