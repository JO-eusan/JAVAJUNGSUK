/* 성별 & 출생년도 확인 */

import java.util.*;

class FlowEx11 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하시오(ex. 011231-1111222) > ");
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7); // 입력받은 문자열의 성별 부분 저장

        switch(gender)
        {
            case '1': case '3': // 남자
                switch(gender)
                    {
                        case '1':
                            System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                            break;
                        case '3':
                            System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                            break;
                    }
                break;
            case '2': case '4':
                    switch(gender) // 여자
                        {
                            case '2':
                                System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                                break;
                            case '4':
                                System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                                break;
                        }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
                break;
        }

        scanner.close();
    }    
}
