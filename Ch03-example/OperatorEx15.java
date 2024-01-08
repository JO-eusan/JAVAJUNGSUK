/* 소문자 -> 대문자 변환 */

class OperatorEx15 
{
    public static void main(String[] args) 
    {
        char lowerCase = 'a';
        System.out.printf("변환 전 > %c", lowerCase);

        System.out.println();

        char upperCase = (char)(lowerCase - 32); // 소문자와 대문자의 차이 = 32
        System.out.printf("변환 후 > %s", upperCase);
    }   
}
