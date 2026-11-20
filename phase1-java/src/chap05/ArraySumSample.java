package chap05;

public class ArraySumSample {

    public static void main(String[] args) {
        int[] scores = {80, 65, 92, 74, 58};
        
        int total = 0;
        for (int score :scores) {
            total = total + score;
        }
        System.out.println("合計：" + total + "点");
        
        double average = (double) total / scores.length;
        System.out.println("平均：" + average + "点");
        
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("最高点：" + max + "点");

    }

}
