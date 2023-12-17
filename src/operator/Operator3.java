package operator;

public class Operator3 {
    // 연산자 우선순위
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; //1 + (2 * 3) // 곰셈이 더 우선순위 높음
        int sum2 = (1 + 2) * 3; // 연산자 우선순위 변경하려면 괄호`()`를 사용한다.
        System.out.println("sum1 = " + sum1); // 7
        System.out.println("sum2 = " + sum2); // 9
    }
}
