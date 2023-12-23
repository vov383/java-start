# 김영한 자바 입문
## 반복문
좋은 코드는 변경사항이 발생했을 때   
변경해야 하는 부분이 적을 수록 좋은 코드

### while문
- 조건에 따라 코드를 반복 실행할 때
  - 참이면 코드블럭 실행
  - 거짓이면 `while`문 벗어나
- 원하는 횟수만큼 반복 실행

```java
package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // i는 몇부터 더해
        int endNum = 3; // endNum은 어디까지 더해
        
        // while문 -->> 원하는 횟수만큼 반복
        while (i <= endNum) { // 코드가 반복되는 횟수를 유연하게 변경 가능
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}

```

#### do-while문 구조
```java
package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
```
- `do-while문`은 최초 한번은 항상 실행된다.
  - 조건을 만족하지 않더라도
- 1번 실행한 후에 조건식 검증하고 거짓이면 빠져나옴.


### break 와 continue
-  `break`
  - 반복문 즉시종료.
- `continue`
  - 반복문의 나머지 부분 건너뛰고 다음 반복으로 진행.

```java
package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) { //무한루프
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; //무한루프 종료
            }
            i++;
        }
    }
}
```
- 조건식이 true라고 되어있으면 조건이 항상 참
- `while`문 무한반복
- `break` 사용해서 탈출

```java
package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        // i=1 -> 2 -> 3은 건너뛰고 4 -> 5 까지 출력
        while(i <= 5) { // 1부터 5까지
            if (i == 3) { // 조건식
                i++; // i값 증가
                continue; // 다음 반복으로 점프
            }
            System.out.println(i);
            i++;
        }
    }
}

```
- 중간에 건너 뛴다.

### for문
- `while`을 
- 좀더 구조화
  - 초기식
    - 반복 횟수 관련된 변수
    - 딱 1번 실행됨.
  - 조건식
    - 조건식 검증
    - 거짓이면 `for`문 빠져나가
  - 증감식
    - 코드 종료되면 증감식 실행
    - 주로 반복횟수와 관련된 변수 값 증가할 때 사용

### for문과 while문 비교
- for문이 더 깔끔
  - 초기식 조건식 증감식이 한 줄에
  - 코드 이해하기 쉽고
  - 반복을 위한 인덱스 변수(카운터 변수)가 명확히 구분됨.
  - 루프 변수의 볌위가 for 블록에 제한됨. 
    - 다른 곳에서 변수 실수할 가능성 적다.
- while문은
  - 루프 조건이 루프 내부에서 변경되는 경우 적합
  - 복잡한 조건을 가진 반복문을 작성하기에 적합
  - 종료시점을 명확하게 알 수 없는 경우
    - 사용자가 종료버튼을 누르면 프로그램 종료
      - `break` 쓰면 됨

##### 정리
정해진 횟수만큼 반복 수행은 for문  
그렇지 않으면 while문

### 중첩 반복문
- 반복문 내부에 또 반복문 만들 수 있음.  
- 3차원 표현이 아닌데 만약 반복문 중첩이 3번 이상이면 뭔가 잘못된 것
  - 사람이 이해하기 어렵기 때문에.

```java
package loop;

public class Nested1 {

    public static void main(String[] args) {

        // 중첩 반복문 실행횟수는 내부 * 외부
        for (int i = 0; i < 2; i++) { // 2번 실행
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) { // 3번 실행
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); // 개행
        }
    }
}

```
