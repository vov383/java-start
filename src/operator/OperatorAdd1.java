package operator;

public class OperatorAdd1 {
    // 증감 연산자
    // ++, --
    // 프로그래밍에서 값을 1씩 증가, 감소 많이 하니까.
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; //a = a + 1
        // 변수 안에 있는 값을 1 증가시킨다.
        // 자기 자신에 1을 더하고 그 결과를 자기 자신에 다시 저장.
        System.out.println("a = " + a); //3
        ++a; //a = a + 1
        System.out.println("a = " + a); //4

    }
}
