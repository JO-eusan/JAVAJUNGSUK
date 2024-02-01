/* x^n 구하기 */

class PowerTest 
{
    public static void main(String[] args)
    {
        int x = 2;
        int n = 5;
        
        System.out.println(x + "의 " + n + "승은 "  + power(x, n) + "입니다.");

    }   
    
    static long power(int x, int n)
    {
        if(n==1) return x;
        return x*power(x, n-1);
    }
}
