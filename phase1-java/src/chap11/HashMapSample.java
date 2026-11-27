package chap11;

import java.util.HashMap;

public class HashMapSample {

    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        
        stock.put("ノート", 12);
        stock.put("ペン", 30);
        stock.put("はさみ", 5);
        
        System.out.println(stock.get("ペン"));
        System.out.println(stock.containsKey("のり"));

        stock.put("ペン", 28); // 同じキーに入れると上書きされる
        System.out.println(stock.get("ペン"));

        for (String name : stock.keySet()) {
            System.out.println(name + "：" + stock.get(name) + "個");
        }
    }
}