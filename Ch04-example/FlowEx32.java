/* 메뉴 선택 */

import java.util.*;

class FlowEx32 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int menu = 0; // 선택 메뉴 번호 초기화

        while(true)
        {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("----------------------");

            System.out.print("원하는 메뉴(1~3)를 선택하시오(종료: 0) > ");
            menu = scanner.nextInt();

            if(menu == 0)
            {
                System.out.println("선택을 종료하셨습니다.");
                break;
            }
            else if((menu < 1) || (menu > 3))
            {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
                continue;
            }
            
            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
        }

        scanner.close();
    }    
}
