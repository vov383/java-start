# 섹션 7. 스캐너 훈련 정리
지금까지 배운 4가지.  
변수, 연산자, 조건문, 반복문을 어떻게 다루냐    
프로그래밍의 기본
지금까지 배운 내용을 훈련하는 시간

사용자의 입력을 받는 방법을 배운다.  

## Scanner
콘솔에서 사용자 입력 받을 수
`System.in()`으로 입력 받을 수 있는데 복잡해.
자바가 `Scanner` 클래스를 제공한다.

- `Scanner scanner = new Scanner(System.in);`
    - 객체와 클래스 개념
    - `Scanner`기능을 사용하기 위해 `new`를 사용하여 `Scanner`를 만든다.
    - `Scanner`는 `Sytem.in`을 사용해서 사용자 입력을 편리하게 받도록 도와준다.
- `scanner.nextLine()`
  - `\n` 입력할 때까지 문자를 가져오는 것.
  - `scanner.nextInt()`
  - `scanner.nextDouble()`도 마찬가지

### 주의
- 타입 안맞으면?
  - `input type이 안맞아 input type mismatch란 exception` 예외를 발생.

### print() vs println()
- `print()`는 
  - 출력 후  다음 라인으로 안넘어감
- `println()`는 
  - 출력 후 다음 라인으로 넘어감
- `\n`은 
  - new line 캐릭터(줄바꿈, 개행 문자)
  - `print("\n")`과 `println()`은 같다


## 스케너 반복 예제

### `nextInt()` 이후 남은 `\n` 처리
- 정수 입력 이후 엔터(`\n`) 입력 시 
  - `\n` 남음. 처리 필요
  - `scanner.nextLine()`로 직접 처리하면 됨.


### 변수 a, b 값 바꾸기
- a = b; b = a 하면 둘이 같은 값이 나옴
- temp 변수 설정
- temp = a; a = b; b = temp; 로 바꾼다.
#### 사이 숫자 예제
```java
package scanner.ex;

import java.util.Scanner;

public class ScannerEX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("num1 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("num2 입력 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
            }
        }
    }
}

```




### while (true) 축약
```java
package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
  public static void main(String[] args) {
    // 문제 - 입력한 숫자의 합계와 평균
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    int num = 0;

/*
        while (true) {
            System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
            num = scanner.nextInt();
            if (num == -1) {
                System.out.println("exit");
                break;
            }
            sum += num;
            count++; // 평균을 구하기 위해 count 필요.
        }
*/

    // 이 반복문을 축약하는 방법.
    // 사용자 -1 입력 시 (-1 != -1) 은 false 여서 루프 탈출
    while ((num = scanner.nextInt()) != -1) {
      sum += num;
      count++; // 평균을 구하기 위해 count 필요.

    }
    double avg = (double) sum / count;
    System.out.println("sum = " + sum);
    System.out.println("avg = " + avg);
  }
}
```

### 간단한 메뉴 주문 반복문 예제
```java
package scanner.ex;

import java.util.Scanner;

public class scannerWhileEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0; // 총비용

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            input = scanner.nextInt();
            if (input == 3) {
                System.out.println("프로그램 종료");
                break;
            } else if (input == 1) {
                scanner.nextLine();
                System.out.print("상품명을 입력하세요 : ");
                String itemName = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요 : ");
                int itemPrice = scanner.nextInt();
                scanner.nextLine();
                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                int coast = itemPrice * quantity;
                sum += coast;
                System.out.println("상품명 : "+itemName+"가격 : "+itemPrice+ "수량 : "+quantity+ "합계 : " +coast );
            } else if (input == 2) {
                System.out.println("총 비용 : " + sum);
                System.out.println("결제 완료");
                sum = 0;
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
          
        }
    }
}
```

