package 비트연산자;
//비트연산자 : 0/1로 구성된 비트 단위의 연산을 수행
// & (비트 AND) : 연산을 수행하는 두개의 비트가 모두 1인 경우 1이됨
// | (비트 OR) : 연산을 수행하는 두개의 비트중 1개만 1이면 1이 됨
// ^ (XO) : 두개의 비트가 같으면  0 ,다르면 1
// ~ (비트를 반전) : 0이면 1, 1이면 0으로 만듬
// << (shift 연산자) : 지정된 수만큼 비트를 왼쪽으로 이동
// >> (shift 연산자) : 지정된 수만큼 비트를 오른쪽으로 이동
public class BitOp {
    public static void main(String[] args) {
        int num1 = 10; // 0000 1010
        int num2 = 12; // 0000 1100
                       // 0000 1000 and
                       // 0000 1110 or
                       // 0000 0110 XOR
                       // 0000 0100 옆으로 왼쪽으로 x2효과

        System.out.println(num1 & num2);  // 8
        System.out.println(num1 | num2);  // 14
        System.out.println(num1 ^ num2);  // 6
        System.out.println(~num1);        // -11
        System.out.println(num1 << 1);    // 20 옆으로 왼쪽으로 x2효과
        System.out.println(num1 >> 1);    // 5 나누기 2 몫
    }
}
