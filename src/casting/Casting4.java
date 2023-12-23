package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5
        System.out.println("div1 = " + div1); //1 // int/int이므로 int타입 결과

        double div2 = 3 / 2; //1.5
        System.out.println("div2 = " + div2); //1.0 // int/int이므로 int타입 결과 나오고 대입하면서 자동 형변환

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5 // // double/int이므로 int가 double로 자동형변환 이후 계산

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); //1.5 // double/int 이므로 int가 double로 자동 형변환 이후 계산

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5
    }
}
