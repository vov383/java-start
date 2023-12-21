package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        // 삼항 연산자 (자바에서 유일하게 항이 3개)
        // 항이 3개
        // 조건 ? 참이면 : 거짓이면
        // 코드 굉장히 간결. 많이 쓴다.
        // 단순한 표현식만 사용 가능

        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
