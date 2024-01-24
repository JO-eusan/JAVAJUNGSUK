/* 구구단 출력 */

import java.util.*;

class FlowEx18 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 구구단 > ");
        int num = scanner.nextInt();

        for(int i=1; i<=9; i++)
        {
            System.out.printf("%2d x %2d = %2d\n", num, i, num*i);
        }

        scanner.close();
    }    
}
