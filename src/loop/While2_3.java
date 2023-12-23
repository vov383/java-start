package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // i는 몇부터 더해
        int endNum = 3; // endNum은 어디까지 더해?

        // while문을 사용하면 원하는 횟수만큼 반복 가능
        while (i <= endNum) { // 코드가 반복되는 횟수를 유연하게 변경 가능
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
