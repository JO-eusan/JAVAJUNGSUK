/* 랜덤값 맞추기 */

import java.util.*;

class FlowEx28 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int input = 0; // 사용자 입력값
        int answer = 0; // 정답

        answer = (int)(Math.random() * 100) + 1; // 1~100값을 랜덤하게 생성 및 저장
        
        do
        {
            System.out.print("1부터 100사이의 정수를 입력하시오 > ");
            input = scanner.nextInt();

            if(input > answer)
                System.out.println("더 작은 수를 입력하시오.");
            else if(input < answer)
                System.out.println("더 큰 수를 입력하시오.");
                
        } while(answer != input); // 정답이 아닐 경우에만 반복

        System.out.println("정답입니다.");

        scanner.close();

    }
}
