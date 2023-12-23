# 섹션 6-1. Scope(스코프) 정리
- 스코프 핵심
  - 변수는 딱 필요한 곳에 한정해서 사용.
## 지역변수
- local
- 특정 지역에서만
  - 변수가 선언된 코드블럭 안
  - 벗어나면 제거됨
  
  
## 스코프 존재 이유
```java
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


```
- 변수 `temp`는 `if` 블럭 안에서 임시로 잠깐 사용할 변수인데 `main` 블럭에 선언하면 문제 발생
  - 메모리 낭비
  - 코드 복잡성 증가

## 마무리
- 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라
- 적절한 제약을 갖춘 프로그램