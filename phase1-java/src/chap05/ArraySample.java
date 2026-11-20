package chap05;

public class ArraySample {

    public static void main(String[] args) {
        int[] scores = {80,65,92,74,58};
        
        System.out.println(scores[0]);
        System.out.println(scores[4]);
        System.out.println(scores.length);
        
        scores[1] = 70;
        System.out.println(scores[1]);
        
        String[] names = new String[3];
        names[0] = "田中";
        System.out.println(names[0]);
        System.out.println(names[1]);
    
    }

}
