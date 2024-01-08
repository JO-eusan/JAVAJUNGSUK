/* 변수에 절대값 -> 부호 붙이기 */

class OperatorEx32 
{
    public static void main(String[] args)
    {
        int x, y, z;
        int absX, absY, absZ; // 수의 절대값 저장 변수
        char signX, signY, signZ; // 수의 부호 저장 변수

        x = 10;
        y = -5;
        z = 0;

        // 절대값 구하기: 양수면 그대로, 음수면 -를 붙여 양수로 변경
        absX = x >= 0 ? x : -x; 
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        // 부호 구하기: 양수면 '+', 음수면 '-', 0이면 ' '를 저장
        signX = x > 0 ? '+' : ( x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : ( y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : ( z == 0 ? ' ' : '-');

        // 출력
        System.out.printf("x = %c%d\n", signX, absX);
        System.out.printf("y = %c%d\n", signY, absY);
        System.out.printf("z = %c%d\n", signZ, absZ);
    }
    
}
