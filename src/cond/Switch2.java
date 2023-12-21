package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 4;

        int coupon;

        // if문을 조금 더 편리하게 쓸 수, 단순한 if문
        // 더 직관적, case에 매칭
        switch (grade) {
            case 1:
                coupon = 1000;
                // switch문 빠져나가기 위해 break
                // 없으면 case 2 실행됨
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
