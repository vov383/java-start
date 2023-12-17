package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); //sum3 같다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        /*
        괄호가 없는 코드는 이 연산을 보고 잠깐 연산자 우선순위를 생각해야 한다.
        이럴 때 명시적으로 ()를 사용하는 것이 읽기 쉽다.
        명확하고 단순한 것이 더 유지보수하기 좋다.
        조금이라도 복잡하면 괄호`()` !!
        * */
    }
}
