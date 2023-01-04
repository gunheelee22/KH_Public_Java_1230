package 알람설정하기;

import java.util.Scanner;

// 상근이라는 친구가 있는데, 이친구는 매일 학교를 지각합니다
// 창영이라는 지각하지 않는 방법을 알려줍니다
// 알람을 설정하면 자동으로 설정 시간보다 45분 일찍 되도록 함
// 입력 시간을 시간과 분으로 입력 받기
// 입력 받은 시간에서 45분 이전에 알람을 울리도록 설정
public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //키보드 입력을 받기 위한 스캐너 생성
        System.out.print("시간 입력 : "); // 시간과 분을 정수값으로 입력받음
        int hour =sc.nextInt();
        System.out.print("분 입력 :");
        int min= sc.nextInt();

        int calc= (hour * 60) + min; //시간을 모두 분으로 일단 변환후 계산이 필요

        if(calc< 45) { calc = (24*60)+min;} //한가지 더 고려해야할 사항은 45분을 뺀 결과가 0보다 작은경우에 대해서 고려필요

        calc -=45; //분으로 변경된 값에서 45를 빼고 결과를 시간과 분으로 환산해서 결과 출력
        System.out.printf(("%d시 %d분 \n"), (calc /60), (calc %60));






    }
}
