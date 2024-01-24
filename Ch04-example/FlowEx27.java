/* 합계 계산기 */

import java.util.*;

class FlowEx27 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하시오(end flag = 0) ");

        int sum = 0;
        boolean flag = true; // 0을 입력하면 flag = false

        while(flag)
        {
            System.out.print(">>");
            int num = scanner.nextInt();

            if(num != 0)
                sum += num;
            else
                flag = false;
        }

        System.out.println("합계 = " + sum);

        scanner.close();
    }
}
