package 진수표현;
// 진법 표현 : 2진법 , 8진법 ,10 진법 ,16진법 (0~9,a,b,c,d,e,f )
public class DecType {
    public static void main(String[] args) {
        int var1 = 0b1010; // 2진수 (0~1)
        int var2 = 0207;    // 8진수 (0~7까지)
        int var3 = 365;     // 10진수
        int var4 = 0xBA;    //16진수

        System.out.println("var1 : " + var1 );
        System.out.println("var1 : " + var2 );
        System.out.println("var1 : " + var3 );
        System.out.println("var1 : " + var4 );



    }
}