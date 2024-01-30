/* 좌표에 X 표시하기 */

import java.util.*;

class MultiArrEx1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        final int SIZE = 10; // 10x10 size 좌표
        int x=0, y=0; // x좌표&y좌표

        char[][] board = new char[SIZE][SIZE]; // 표시&출력 좌표
        byte[][] shipBoard = {
                                // 1 2 3 4 5 6 7 8 9
                                {  0,0,0,0,0,0,1,0,0}, // 1
                                {  1,1,1,1,0,0,1,0,0}, // 2
                                {  0,0,0,0,0,0,1,0,0}, // 3
                                {  0,0,0,0,0,0,1,0,0}, // 4
                                {  0,0,0,0,0,0,0,0,0}, // 5
                                {  1,1,0,1,0,0,0,0,0}, // 6
                                {  0,0,0,1,0,0,0,0,0}, // 7
                                {  0,0,0,1,0,0,0,0,0}, // 8
                                {  0,0,0,0,0,1,1,1,0}  // 9
                            };

        // board의 1행에는 행번호를, 1열에는 열번호를 저장
        for(int i=1; i<SIZE; i++)
        {
            board[0][i] = board[i][0] = (char)(i+'0'); // 문자로 변형해서 저장
        }
        
        while(true)
        {
            System.out.print("좌표를 입력하시오(종료는 00) > ");
            String input = scanner.nextLine();

            if(input.length() == 2) // 제대로 입력한 경우
            {
                x = input.charAt(0) - '0'; // 숫자로 변형
                y = input.charAt(1) - '0'; 

                if(x==0 && y==0) // 종료
                    break;
            }

            if(input.length() != 2 || x<=0 || x >= SIZE || y<=0 || y >= SIZE)
            {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

            // 결과 출력
            for(int i=0; i<SIZE; i++)
            {
                for(int j=0; j<SIZE; j++)
                    System.out.printf("%2c", board[i][j]);
                System.out.println();
            }
            System.out.println();

        }

        scanner.close();
    }
}
