package chap03;

public class GradeSample {

    public static void main(String[] args) {
        int score = 75;
        
        if(score >= 80) {
            System.out.println("評価：A");
        }else if (score >= 60) {
            System.out.println("評価：B");
        }else {
            System.out.println("評価：C");
        }

    }

}
