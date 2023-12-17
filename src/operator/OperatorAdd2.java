package operator;

public class OperatorAdd2 {
    // 전위, 후위
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 사용 예
        a = 1; //a 값을 다시 1로 지정
        b = 0; //b 값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //결과: a = 2, b = 1

        // 단독으로 사용하는 경우 결과 같음.
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        // 다른 연산이 없기 때문에 본인 값만 증가.
    }
}
