package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        // temp는 if 블럭 안에서만 사용하는 변수. 얘가 main 끝까지 생존하면 메모리 낭비.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
