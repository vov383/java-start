package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        System.out.println(count+"개의 정수를 입력하세요 : ");
        int[] numbers = new int[count];
        numbers[0] = scanner.nextInt();

        for (int i = 1; i < count; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i-1] > numbers[i]) {
                int temp = numbers[i-1];
                numbers[i-1] = numbers[i];
                numbers[i] = temp;
            }
        }

    /* 김영한 강사 답안
        int minNumber, maxNumber;
        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
     */

//        Arrays.sort(numbers);

        System.out.println("가장 작은 정수 : " + numbers[0]);
        System.out.println("가장 큰 정수 : " + numbers[count-1]);
    }
}
