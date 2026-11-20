package chap05;

public class ScoreSummary {

    public static void main(String[] args) {
        int[] scores = {20, 30, 93, 105, 78, 58}; 

    int sum = 0;
    int max = scores[0];
    int min = scores[0];
    int passCount = 0;
    
    for (int score : scores) {
        sum += score;

        if (score > max) {
            max = score;
        }

        if (score < min) {
            min = score;
        }

        if (score >= 60) {
            passCount++;
        }
    }
    double average = (double) sum / scores.length;

    System.out.println("合計：" + sum + "点");
    System.out.println("平均：" + average + "点");
    System.out.println("最高点：" + max + "点");
    System.out.println("最低点：" + min + "点");
    System.out.println("60点以上の人数：" + passCount + "人");

    }

}
