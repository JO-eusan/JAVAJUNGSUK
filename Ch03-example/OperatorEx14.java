/* 문자 출력 (유니코드 이용) */

class OperatorEx14 
{
    public static void main(String[] args)
    {
        char c = 'a'; // 'a' ~ 'z'
        for(int i=0; i < 26; i++)
        {
            System.out.print(c++); // 'a'부터 26개 문자 출력 (출력 후, c + 1)
        }
        System.out.println(); // 줄바꿈

        c = 'A'; // 'A' ~ 'Z'
        for(int i=0; i < 26; i++)
        {
            System.out.print(c++); // 'A'부터 26개 문자 출력 (출력 후, c + 1)
        }
        System.out.println(); // 줄바꿈

        c = '0'; // '0' ~ '9'
        for(int i=0; i < 10; i++)
        {
            System.out.print(c++); // '0'부터 10개의 문자 출력 (출력 후, c + 1)
        }
        System.out.println(); // 줄바꿈
    }    
}
