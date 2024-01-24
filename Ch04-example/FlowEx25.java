/* 각 자릿수의 합 */

import java.util.*;

class FlowEx25 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 > ");
        int num = scanner.nextInt();

        int sum = 0; // 합을 저장할 변수
        while(num != 0)
        {
            sum += num%10;
            System.out.printf("sum = %3d num = %3d\n", sum, num);

            num /= 10;
        }

        System.out.println();
        System.out.printf("각 자리수의 합 : %3d", sum);

        scanner.close();
    }
}
