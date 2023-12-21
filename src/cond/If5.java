package cond;

public class If5 {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;
        // 독립조건 == 조건이 서로 별개, 각각 따로 수행되어야
        // 한 사용자가 동시에 여러 할인을 받을 수 있다.
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
