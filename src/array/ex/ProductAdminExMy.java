package array.ex;

import java.util.Scanner;

public class ProductAdminExMy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int maxProducts = 10;

        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];

        int productCount = 0;

        while (menu != 3) {
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    if (productCount >= maxProducts) {
                        System.out.println("더이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요 : ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;
                    break;

                case 2:
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                    }
                    break;

                default:
                    System.out.println("잘못 눌렀습니다. 1, 2, 3 중 하나를 입력하세요.");
            }

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
