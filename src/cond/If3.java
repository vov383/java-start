package cond;

public class If3 {

    public static void main(String[] args) {
        // 불필요한 조건검사 -->> 5번으로 모든 조건을 검사.
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) { // 중복체크 -->> age >= 8 조건은 위 if문으로 이미 검증됨.
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
