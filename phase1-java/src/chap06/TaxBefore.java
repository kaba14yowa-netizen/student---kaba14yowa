package chap06;

public class TaxBefore {

    public static void main(String[] args) {
        int notebookPrice = 150;
        int notebookTaxIncluded = notebookPrice * 110 / 100;
        System.out.println("ノート：" + notebookTaxIncluded + "円");

        int penPrice = 100;
        int penTaxIncluded = penPrice * 110 / 100;
        System.out.println("ペン：" + penTaxIncluded + "円");

        int scissorsPrice = 300;
        int scissorsTaxIncluded = scissorsPrice * 110 / 100;
        System.out.println("はさみ：" + scissorsTaxIncluded + "円");
    }
}