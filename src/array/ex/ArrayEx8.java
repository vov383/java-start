package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"kor", "mat", "eng"};

        System.out.print("학생 수를 입력하세요 : ");
        int studentCount = scanner.nextInt();
        int[][] students = new int[studentCount][subjects.length];

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j]+" 점수 : ");
                students[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            double avg = 0.0;
            for (int j = 0; j < subjects.length; j++) {
                total += students[i][j];
                avg = (double) total / subjects.length;
            }
            System.out.println((i + 1) + "번 학생의 총점 : " + total + ", 평균 : " + avg);
        }

    }
}
