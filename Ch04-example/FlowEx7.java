/* 가위바위보 */

import java.util.*;

class FlowEx7 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하시오 > ");
        int user = scanner.nextInt(); // 가위, 바위 보 중 하나를 정수로 입력받음
        int com = (int)(Math.random() * 3 + 1); // 1,2,3 중 하나가 com에 저장
        
        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴은 " + com + "입니다.");

        switch(user - com)
        {
            case 2: case -1:
                System.out.println("당신은 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신은 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
        }


        scanner.close();
    }
}
