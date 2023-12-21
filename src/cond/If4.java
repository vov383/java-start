package cond;

public class If4 {

    public static void main(String[] args) {
        int age  = 15;
        // else if -->> 여러 if문을 하나로 묶어.
        // 조건을 만족하면 딱 하나만 실행하고 if문 빠져나옴
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
