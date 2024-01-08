/* 숫자? 영문자? 판별 */

import java.util.*;


class OperatorEx25 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Scanner객체 생성
        char ch = ' '; //초기화

        System.out.printf("문자를 하나 입력하세요 > ");
        String input = scanner.nextLine();
        ch = input.charAt(0); // 입력한 문자열의 첫번째 문자만 가져오기

        if('0' <= ch && ch <= '9')
        {
            System.out.println("입력하신 문자는 숫자입니다.");
        }
        else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'))
        {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

        scanner.close();
    }
    
}
