package chap03;

public class SwitchSample {

    public static void main(String[] args) {
        String rank= "silver";
                
        switch(rank) {
        case"gold":
            System.out.println("割引率：20%");
            break;
        case"silver":
            System.out.println("割引率：10%");
            break;
        case"bronze":
            System.out.println("割引率：5%");
            break;
        default:
            System.out.println("割引はありません");
            break;
        }

    }

}
