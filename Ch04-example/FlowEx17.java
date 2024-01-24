/* 직삼각형 별 찍기 */

import java.util.*;

class FlowEx17 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("*을 출력할 라인의 수를 입력하시오> ");
        int num = scanner.nextInt(); // 입력받은 숫자를 저장

        for(int i=0; i<num; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }

        scanner.close();
    }    
}
