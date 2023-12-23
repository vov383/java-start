package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
//        long maxIntOver = 2147483648; //int 최고값 + 1(초과)
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); // 2147483647 // 문제없음

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); // -2147483648 (int의 제일 작은 범위) // 마치 시계가 한바퀴 돌고 다시 시작하듯이
    }
}
