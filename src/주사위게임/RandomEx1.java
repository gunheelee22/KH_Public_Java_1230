package 주사위게임;
// 두개의 주사위 던져 합이 12개가 나오면 종료하는 게임
public class RandomEx1 {
    public static void main(String[] args) {
        while(true){
            int num1= (int) ((Math.random() * 6) + 1);
            int num2= (int) ((Math.random() * 6) + 1);
            if(num1 + num2 == 12) {
                System.out.println("무인도 탈출");
                break;
            }
            System.out.println("주사위의 합은 " + (num1 + num2) +"입니다" );
        }
    }
}
