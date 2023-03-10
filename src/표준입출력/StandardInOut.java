package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 수원시";
        char gender = '남'; // 문자로 간주하기위해서  ''요걸씀 String 쓰면 ""가능
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        // 자바 스타일 (print () / println() 메소드 오버로딩)
        System.out.println("======== Java Style ======");
        System.out.println("이름 : " + name);
        System.out.println("주소 :  " + addr );
        System.out.println("성별 : " + gender);
        System.out.print("나이 : " +age+ "\n" );
        System.out.println("총점 : "  + (kor + eng +mat));        //문자열과 종속 은 () 우선순위를 높인다
        System.out.println("평균 :"   +((double)(kor+eng+mat )/3));

        // C언어 스타일 (서식 지정자와 이스케이프 시퀀스 사용)
        // 서식지정자 :  %d, %f , %.2f, %2d ,%s,%c ,%b, %%
        // 이스케이프 시퀀스 : \n , \r, \t, \b, \\
        System.out.printf("========== C Style==========\n"); // \n 줄바꿈
        System.out.printf("이름 : %s \n",name);
        System.out.printf("이름 : %s ,주소 : %s \n",name,addr);
        System.out.printf("성별 : %c\n",gender ) ; // %c 문자 출력
        System.out.printf("나이 : %d \n",age); // %d 정수 출력
        System.out.printf("총점 : %d \n ",kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double) (kor + eng +mat)/3);
        System.out.printf("Apple\rBanana"); //커서를 맨 앞에 돌린다
        System.out.printf("Apple ,Banana\b\b\b"); //백스페이스 3개
        System.out.printf("Apple \t\t\t,Banana"); //탭


        System.out.println("\"Enter\"키를 입력 하시면 종료 됩니다");
        System.out.println("Hello\\Java");
        System.out.println("오늘의 습도는 25%입니다");





    }
}
