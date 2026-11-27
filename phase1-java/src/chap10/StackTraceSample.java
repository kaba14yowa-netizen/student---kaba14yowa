package chap10;

public class StackTraceSample {

    public static void main(String[] args) {
        int[] emptyScores = {};
        printAverage(emptyScores);
    }

    static void printAverage(int[] scores) {
        int average = calcAverage(scores);
        System.out.println("平均：" + average + "点");
    }

    static int calcAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total = total + score;
        }
        return total / scores.length; // 要素が0個だと、0で割ることになる
    }
}