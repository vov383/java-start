package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] scores = {90, 80, 70, 60, 50};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double avg = (double)total / scores.length;
        System.out.println("total = " + total);
        System.out.println("avg = " + avg);

    }
}
