package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        // i=1 -> 2 -> 3은 건너뛰고 4 -> 5 까지 출력
        while(i <= 5) { // 1부터 5까지
            if (i == 3) { // 조건식
                i++; // i값 증가
                continue; // 다음 반복으로 점프
            }
            System.out.println(i);
            i++;
        }
    }
}
