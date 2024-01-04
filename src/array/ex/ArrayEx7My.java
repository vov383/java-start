package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx7My {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"kor", "mat", "eng", "tot", "avg"};
        int row = 4;
        int column = subjects.length;
        double[][] students = new double[row][column];

        for (int i = 0; i < students.length; i++) {
            students[i][3] = 0; // tot
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            for (int j = 0; j < subjects.length-2; j++) {
                System.out.print(subjects[j]+" 점수 : ");
                students[i][j] = scanner.nextInt();
                students[i][3] += students[i][j]; // tot에 점수 누적
            }
            students[i][4] = (double) students[i][3] / 3; // avg
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"번 학생의 총점 : " +students[i][3]+ ", 평균 : "+students[i][4]);
        }
    }
}
