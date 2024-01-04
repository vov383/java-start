# 섹션 8. 배열 정리
배열이 필요한 이유  
loop로 해결 못하는 중복이 있음.    
배열 변수로 같은 타입의 변수를 사용하기 편하게 할 수.

## 배열의 선언과 생성

### 1. 배열 변수 선언

```java
int[] students; // 1. 배열 변수 선언
students = new int[5]; 2. 배열 생성
```

- 배열을 사용하려면 `int[] students;` 와 같이 배열을 선언해야
- `int[]`처럼 `[]`가 들어간다.
- 아직 사용할 수 있는 배열 만들어진 것 아님
  - `int a`에는 정수를, `double b`에는 실수를 담을 수
  - `int[] students`와 같은 배열 변수에 배열 담을 수

### 2. 배열 생성
- `new int[5]`는 총 5개의 int형 변수 만들어짐.
- `new`는 새로 생성한다
- `int[5]`는 int형 변수 5개
  - => `int`형 변수 5개를 다룰 수 있는 배열을 새로 만든다
- `int student1`, `int student2`, `int student3` ...... `int student5`까지 5개 변수 직접 선언할 필요X

#### 배열과 초기화
- `new int[5]` 라고 하면 총 5개의 `int` 형 변수가 만들어진다. 자바는 배열을 생성할 때 그 내부값을 자동으로
초기화한다
- 숫자는 `0` , `boolean` 은 `false` , `String` 은 `null`(없다는 뜻이다.)로 초기화 된다


### 3. 배열과 참조값 보관
- `new int[5]` 로 배열을 생성하면 배열 크기만큼 메모리 확보.
  - `int` 형을 5개 사용하면 `4byte * 5` -> `20byte` 를 확보.
- 배열을 생성하면 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)(`x001`)을 반환한다.
  - 여기서 `x001` 이라고 표현한 것이 참조. 
    - (실제로 `x001`이 아니고 이해를 돕기 위한 예시.)
- 앞서 선언한 배열 변수 `int[] students` 에 참조값(`x001`)을 보관한다.
- `int[] students` 변수는 `new int[5]` 로 생성한 배열의 참조값을 가지고 있다.
  - 이 참조값을 통해 배열을 참조할 수 있다.
    - 참조값을 통해 메모리에 있는 실제 배열에 접근하고 사용할 수 있다.
  - 참고로 배열을 생성하는 `new int[5]` 자체에는 아무런 이름이 없다 
    - `int` 형 변수를 5개 연속으로 만드는 것. 
  - 앞서 `int[] students` 변수에 참조값(`x001`)을 보관 -> 이 변수로 배열에 접근할 수 있다

```java
int students = new int[5]; // 1. 배열 생성
int students = x001; // 2. new int[5]의 결과로 x001 참조값 반환
students = x001 // 3. 최종 결과;
```

참조값 확인
```
System.out.println(students);
// [I@4617c264] @앞의 [I는 int형 배열. @뒤에 16진수는 참조값
```

    
## 배열 사용

### 인덱스

```java
// 변수 값 대입
students[0] = 90;
students[1] = 80;

// 변수 값 사용
System.out.println(students[0]);
System.out.println(students[1]);
```

배열은 변수와 사용법 비슷  
차이점은 `[]`사이에 숫자

#### 배열은 0부터 시작
`new int[5]` 와 같이 5개의 요소를 가지는 `int` 형 배열을 만들었다? -> 인덱스는 `0,1,2,3,4`   
인덱스의 범위는 `0~ (n-1)`
만약 접근 가능한 배열의 인덱스 범위를 넘어가면 오류 발생  
`.ArrayIndexOutOfBoundsException`

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out 
of bounds for length 5 at array.Array1Ref1.main(Array1Ref1.java:14)
```

### 기본형 vs 참조형

사용하는 값을 직접 넣을 수 있는 기본형   
메모리의 참조값을 넣을 수 잇는 참조형

- 기본형(Primitive Type)
  - `int`, `long`, `double`, `boolean` 등
  - 선언과 동시에 크기 정해짐
- 참조형(Reference Type)
  - 데이터에 접근하기 위해 메모리 주소를 저장하는 데이터 타입
  - 객체, 클래스를 담을 수 있는 변수들도 참조형
  - 기본형을 제외한 모든 변수는 참조형
  - 크기 동적으로 할당 가능 -> 유연성
  - 더 복잡한 데이터 구조 만들고 관리

## 배열 리펙토링

```java
int[] students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화
```
```java
int[] students = {90, 80, 70, 60, 50};
```

```java
package array;

public class Array1Ref4 {

  public static void main(String[] args) {
//    int student1 = 90;
//    int student2 = 80;
//    int student3 = 70;
//    int student4 = 60;
//    int student5 = 50;
    // 배열 생성
    int[] students = {90, 80, 70, 60, 50};

    
//    System.out.println("학생1 점수: " + student1);
//    System.out.println("학생2 점수: " + student2);
//    System.out.println("학생3 점수: " + student3);
//    System.out.println("학생4 점수: " + student4);
//    System.out.println("학생5 점수: " + student5);
    //변수 값 사용
    for (int i = 0; i < students.length; i++) {
      System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
    }
  }
}

```

- 참고 : 리펙토링
  - 리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선
  - 가독성, 유지보수성 up 
  - 리펙토링은 버그를 줄이고, 프로그램의 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다. 
  - 쉽게 이야기해서 작동하는 기능은 똑같은데, 코드를 개선하는 것을 리펙토링이라 한다
  - 코드 설계 개선 -> 밖에서 보기는 똑같이 동작. 코드가 다름.
  
- 반복문을 사용해서 배열을 통해 값을 사용하는 부분을 효과적으로 변경
- 배열의 인덱스는 0부터 시작하기 때문에 반복문에서 i = 0 을 초기값으로 사용했다.
-  `students.length`
  - 배열의 길이를 제공하는 특별한 기능
  - 조회만 할 수 있다. 대입은 할 수는 없다


## 2차원 배열
행과 열로 구성

![img.png](img.png)
`int[][] arr = new int[2][3];`와 같이 선언하고 생성한다.
`arr[1][2]`와 같이 사용하는데, 먼저 행(row) 번호를 찾고 그 다음에 열(column) 번호를 찾는다.

3차원 배열은 사용할 일 거의 없을 것

```java
package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[10][10];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();//한 행이 끝나면 라인을 변경한다.
        }
    }
}

```

## 향상된 for문
for-each문     
인텔리제이 단축키 -> `iter + tab`  
for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요

```java
package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문  // 단축키 -> `iter + tab`
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }
}

```

