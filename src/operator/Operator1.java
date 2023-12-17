package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);
        // int형 끼리 나누면 소수점 표시 안된다. 날아감
        // 왜? 형변환 때문에

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
        // 나머지 연산자는 실무와 알고리즘 모두에 종종 사용됨.

//        int z = 10 / 0;
        // 0으로 나누기는 허용x
        // 예외 발생. 예외처리에서 따로 다룬다.
    }
}
