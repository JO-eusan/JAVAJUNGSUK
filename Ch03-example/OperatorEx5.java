/* 사칙 연산자 */

class OperatorEx5 
{
    public static void main(String[] args)
    {
        int a = 10; 
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a+b); // 덧셈
        System.out.printf("%d - %d = %d\n", a, b, a-b); // 뺄셈
        System.out.printf("%d * %d = %d\n", a, b, a*b); // 곱셈
        System.out.printf("%d / %d = %d\n", a, b, a/b); // 나눗셈
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b); // 나눗셈 (실수)
    }    
}
