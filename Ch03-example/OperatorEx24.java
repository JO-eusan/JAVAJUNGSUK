/* 논리 연산자 */

class OperatorEx24 
{
    public static void main(String[] args)
    {
        // 변수 초기화
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x=%2d, x는 10보다 크고 20보다 작다 -> %b \n", x, 10 < x && x < 20);

        x = 6; 
        System.out.printf("x=%2d, x는 2의 배수 또는 3의 배수니만 6의 배수는 아니다 -> %b \n", x, (x%2==0 || x%3==0) && x%6!=0);

        ch = '1';
        System.out.printf("ch=%2c, ch는 숫자이다. -> %b \n", ch, '0' <= ch && ch <= '9');

        ch = 'a';
        System.out.printf("ch=%2c, ch는 소문자이다. -> %b \n", ch, 'a' <= ch && ch <= 'z');

        ch = 'A';
        System.out.printf("ch=%2c, ch는 대문자이다. -> %b \n", ch, 'A' <= ch && ch <= 'Z');
    }
}
