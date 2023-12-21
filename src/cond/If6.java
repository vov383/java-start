package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 조건이 하나만 적용되고 if문 빠져나감
        if (price >= 10000) { // true
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인"); 
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        // if명령이 한줄이라도 헷갈릴 수 있으니까 코드블럭 사용 권장
        // 가독성 측면, 유지보수 측면
        // if문이 명확해짐
        if(false) {
            System.out.println("if문에서 실행됨"); // 한줄이면 블럭 없이 쓸 수
            System.out.println("if문에서 실행안됨"); // 얘는 if문과 별개로 실행된 것.
        }
    }
}
