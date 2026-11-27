package chap11;

import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        
        names.add("田中");
        names.add("鈴木");
        names.add("佐藤");
        
        System.out.println(names.get(0));
        System.out.println(names.size());
        
        names.remove(1);
        System.out.println(names);
        
        for (String nameString : names) {
            System.out.println(nameString + "さん");
        }
        
    }

}
