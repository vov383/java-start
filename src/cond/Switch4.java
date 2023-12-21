package cond;

public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;

        // 자바 14 에서 추가된 switch문
        // 실무에선 자바 14를 많이 안쓴다.
        // 더 간결함.
        // `->` 사용. 선택한 데이터를 반환.
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
