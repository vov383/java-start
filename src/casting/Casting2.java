package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; //컴파일 오류 발생
//        incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue; ///형변환 // 직접 적으니까 명시적 형변환
        System.out.println(intValue); // 1 // .5 삭제됨

        System.out.println("doubleValue = " + doubleValue); // doubleValue 값은 그대로

    }
}
