package loop;

public class While1_2 {

    public static void main(String[] args) {
        int count = 0;

        // count가 3보다 작을 때 코드블럭 반복 실행
        // count = 0 -> 1 -> 2 -> 3 이제 while문 빠져나가
        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는:" + count);
        }
    }

}
