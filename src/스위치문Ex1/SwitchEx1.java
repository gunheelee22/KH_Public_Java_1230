package 스위치문Ex1;
import java.util.Scanner;

//Switch문은 조건값에 따라 분기 할 수 있으며,조건 값은 정수,문자,문자열이 올수 있음
public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season =sc.next();
        switch (season){
            case "spring" : //케이스1 해당하는 조건이 실행 됨 조건이 안끝나서:
                System.out.println("봄이 왔어요");
                break; //해당 조건을 종료함
            case "summer" :
                System.out.println("여름이 왔어요");
                break;
            case "fall":
            case "autumn" :
                System.out.println("가을이 왔어요");
                break;
            case "winter":
                System.out.println("겨울이 왔어요");
                break;
            default :
                System.out.println("계절을 다시 입력하세요");

        }


    }
}
