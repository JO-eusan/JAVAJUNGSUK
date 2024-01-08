/* 반올림 출력 */

class OperatorEx17 
{
    public static void main(String[] args)
    {
        double pi = 3.141592;
        double shortPi = (int)(pi*1000 + 0.5) / 1000.0; // 0.5를 더해서 버림이 아닌 반올림
        // (int)(pi*1000 + 0.5)대신 Math.round(pi*1000) 대체 가능

        System.out.println(shortPi);
    }
    
}
