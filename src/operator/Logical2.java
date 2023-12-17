package operator;

public class Logical2 {
    // 논리 연산자 활용
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
//        boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        boolean result = 10 < a && a < 20; //(a > 10) && (a < 20)
        // 조금 더 읽기 좋다. a가 10부터 20까지 한눈에 알 수 있음.
        System.out.println("result = " + result);
    }
}
