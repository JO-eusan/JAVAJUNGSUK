/* 숫자 입력 체크 */

import java.util.*;

class FlowEx2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input; // 입력 숫자 변수 선언

        System.out.print("숫자를 하나 입력하세요 > ");

        String tmp = scanner.nextLine(); // 문자열 임시 저장
        input = Integer.parseInt(tmp); // 문자열 -> 정수

        if(input == 0)
        {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        else
        {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.", input);
        }

        scanner.close();
        
    }    
}
