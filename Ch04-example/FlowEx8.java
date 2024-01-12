/* 주민번호를 통해 성별 체크 */

import java.util.*;

class FlowEx8 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하시오(ex. 011231-1111222) > ");
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7); // 입력받은 번호에 8번째 문자를 저장

        switch(gender)
        {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
                break;
        }


        scanner.close();
    }    
}
