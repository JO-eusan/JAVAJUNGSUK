/* 빙고 */

import java.util.*;

class MultiArrEx2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
    
        final int SIZE = 5; // 빙고판 size 5x5
        int x=0, y=0, num=0;

        int[][] bingo = new int[SIZE][SIZE];

        // 배열의 모든 요수를 1부터 SIZE*SIZE까지의 숫자로 초기화
        for(int i=0; i<SIZE; i++)
        {
            for(int j=0; j<SIZE; j++)
            {
                bingo[i][j] = i*SIZE + j + 1;
            }
        }

        // 배열에 저장된 값을 shuffle
        for(int i=0; i<SIZE; i++)
        {
            for(int j=0; j<SIZE; j++)
            {
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do
        {
            for(int i=0; i<SIZE; i++)
            {
                for(int j=0; j<SIZE; j++)
                {
                    System.out.printf("%2d ", bingo[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하시오(종료:0) > ", SIZE*SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            // 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장

            outer:
            for(int i=0; i<SIZE; i++)
            {
                for(int j=0; j<SIZE; j++)
                {
                    if(bingo[i][j] == num)
                    {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while(num!=0);

        scanner.close();
    }
}
