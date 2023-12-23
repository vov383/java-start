package loop;

public class Nested1 {

    public static void main(String[] args) {

        // 중첩 반복문 실행횟수는 내부 * 외부
        for (int i = 0; i < 2; i++) { // 2번 실행
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) { // 3번 실행
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); // 개행
        }
    }
}
