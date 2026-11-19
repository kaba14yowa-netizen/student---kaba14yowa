package chap03;

public class ConditionSample {

    public static void main(String[] args) {
        int age = 68;
        boolean hasCoupon = false;
        
        if(age >=65||hasCoupon) {
            System.out.println("割引が適用されます");
        }
        
        int score = 75;
        if(score >= 60 && score < 80) {
            System.out.println("評価はBです");
        }

    }

}
