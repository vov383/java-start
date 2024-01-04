# 섹션 9. 메서드 정리

## 메서드 시작
- 코드를 중복 제거
  - 비슷한 코드가 여러 군데에서 사용될 때  
- 코드 수정도 한번에 가능

### 수학의 함수(function)
수학의 함수 개념을 프로그래밍에 가져오자  
`add(a, b) = a + b`

함수 사용'
```
add(1, 2) -> 3
add(5, 6) -> 11
add(3, 5) -> 8
```

함수를 한번 만들어두면 다음에 같이 사용.  

### 메서드 정의
메서드는 선언과 본문으로 나눌 수
#### 메서드 선언
`public static int add(int a, int b)`
메서드 이름, 반환타입, 파라미터 목록 포함

- `public static`
  - `public` : 접근 제어
  - `static` : 정적 메서드, 객체 생성 없이 호출 가능
- `int add(int a, int b)`
  - `int` :  반환 타입
  - `add` : 메서드 이름, 이름으로 호출 가능
  - `(int a, int b)` : 파라미터
    - 이 변수들은 메서드 안에서만 사용. 


#### 메서드 본문
- 메서드 호출했을 때 수행해야하는 본문
- 블랙박스
  - 호출 입장에서 블럭을 몰라. 선언만 알아
    - `return`문에 원하는 리턴
      - 반환타입 맞아야


### 메서드 호출과 용어정리

#### Argument
인수, 인자, 아규먼트

#### Parameter
매개변수, 파라미터

##### Argument vs Parameter
둘이 혼동해서 많이 부름

- 인수
  - 들어가는 변수
  - 메서드 내부로 들어가는 값
- 매개변수
  - 중간에서 전달하는 변수
  - 메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수

## 메서드 정의
- 제어자(modifier)
  - `public` `static`
- 반환 타입(retrun type)
  - 반환 값 없으면 `void`
- 메서드 이름(name)
- 매개변수(parameter)
  - 입력값
  - 메서드 내부에서 사용할 변수
- 메서드 본문(body)
  - 실제 메서드 코드
  - `{}`(중괄호) 사이에 코드 작성

### return문 만나면 즉시 메서드를 빠져나간다.

## 메서드 호출과 값 전달 1
자바의 대원칙  
**자바는 항상 변수의 값을 복사해서 대입한다.**

### 변수와 값 복사
```java
package method;

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;

        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}

```
`int nu2  num1;`
- `num1`에 있는 값을 복사해서 `num2`에 넣는다.
- `num1`의 기존 값 `5`가 유지되고 새로운 값이 `num2`에 들어간다.
- `num1`변수 자체가 `num2`에 들어간 것이 아니다.
- `num1`과 `num2`는 별개

### 메서드 호출과 값 전달2
- 각각의 메서드 안에서 사용하는 변수는 서로 다른 변수
- 매개변수의 이름이 같아도 다른 변수

#### 메서드 호출과 이름이 같은 변수

### 메서드 호출과 값 반환받기
변수에 `return`받은 반환값을 복사해서 대입한다.  

**자바는 항상 변수의 값을 복사해서 대입한다.**

참고로 뒤에 참조형도 똑같다.  
참조형은 참조값을 복사해서 대입한다. 


### 메서드 호출과 값 복사


### 메서드 호출과 값 반환 받기
변수에 `return`값을 반환받아서 사용 

### 메서드 형변환
메서드를 호출하는데 인자와 매개변수 타입이 맞지 않을 때  

#### 명시적
`double`에 `int` 대입 시도
```
double number = 1.5;
printNumber(number); //double을 int에 대입하므로 컴파일 오류
```

실행결과 -> 컴파일 에러
`java: incompatible types: possible lossy conversion from double to int`  

메서드 호출이 꼭 필요하다면 명시적 형변환 사용.

### 자동 형변환
`int > long > double`
메서드 호출할 때 매개변수에 값 전달하는 것도 변수에 값 대입하는 것 -> 자동 형변환 그대로 적용  
- double형 파라미터에 `int`형 인수 전달하면 자동
 
### 정리
메서드 호출할 때  
전달하는 인수 타입과 매개변수 타입 맞아야  
타입 달라도 자동형변환 가능하면 호출 할 수 


리펙토링은 가독성 향상  
메서드 제목만 봐도 무슨 기능을 하는지 한눈에 알 수 있게  
책의 목차처럼  
비지니스의 의도가 코드에 보이도록

- 넘기는 값과 파라미터 순서와 갯수 맞아야

## 메서드 오버로딩
- 과적(오버로딩)
  - 물건을 과하게 담았다. 

### 메서드 오버로딩 규칙
- 메서드 이름은 같고
- 매개변수의 타입 및 순서가 다를 때  
- 같은 이름의 메서드를 여러 개 정의한 것 

### 오버로드 아닌 것
  - 반환타입만 다른 건 오버로딩X
  - 매개변수 이름만 다른 것도 해당x

### 오버로드 예제
#### 파라미터 개수 다르게
```java
package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,2,3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}


```

#### 파라미터 순서 다르게
```java
package method;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}

```
```java
package method;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}

```

참고로 메서드 오버라이딩과 구별

### 복잡한 케이스는 단순하게 다시 작성
- 단순하고 명확하게 해야 유지보수 가능하다.
- 너무 복잡한 케이스를 만들면 안된다.

### 변수명 vs 메서드명
- 변수명은 명사로, 
- 메서드명은 동사로 
  - 동작하는데 사용하니까

### 메서드 사용 장점
- 코드 재사용
  - 특정 기능 캡슐화 -> 메서드를 호출하여 기능 재사용
- 코드 가독성
  - 메서드명이 메서드 수행할 작업을 명시하여 문맥을 제공
- 모듈성
  - 큰 프로그램을 작은 프로그램으로 나눠
  - 코드 가독성UP, 디버깅 쉽게
- 코드 유지 관리
  - 수정이 필요할 때 해당 메서드만 수정
  - 변경 시 전체 코드베이스에 영향x
- 재사용성, 확장성
  - 잘 만든 메서드는 다른 프로그램에 재사용
  - 새로운 기능 추가, 기존 기능 확장하는데 유용
- 추상화
  - 메서드를 사용하는 곳은 메서드 구현을 몰라도 됨
- 테스트와 디버깅 용이성
  - 개별 메서드를 독립적으로 테스트하고 디버그
- 
