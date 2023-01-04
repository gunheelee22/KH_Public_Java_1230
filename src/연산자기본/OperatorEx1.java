package 연산자기본;

import java.util.Scanner;

//산술연산자 : +, -,* , / ,% (나머지)
//대입 연산자 = : 변수에 값을 대입할때 사용하는 이항 연산자 입니다 (방향은 오른쪽에 왼쪽으로 진행)
//증감 연산자 : ++ -- 단항연산자 피연산의 값을 1증가또는 1감소 시킴
//비교 연산자 : 두개의 피연산자를 비교해서 참가 거짓을 판별하는 것 < >
//논리 연산자 : AND(&&) 두개의 조건이 모두 참이면 참
//OR (||) 두개의 조건중 하나만 참이면 참 , NOT(!)현재의 조건을 부정
//삼항연산자 : 항이 3개인 연산자 ,조건문의 일종이며 참과 거짓만 있는 경우 사용 가능
//문자열 결합 연산자 : +
//연산자 우선 순위
public class OperatorEx1 {
    public static void main(String[] args) {
        int val1 =5, val2 =5, val3=5;
        int rst1, rst2, rst3 ,rst4 ;
        rst1 = val1 + val2 * val3; // 30
        rst2 = (val1 + val2 )*val3; //50
        rst3 = val1 + (++val2) * val3; //35
        rst4 = val1 + (val2++)* val3; //35

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        System.out.println(rst4);





    }
}