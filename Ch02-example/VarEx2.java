/* 두 변수 값 교환 */

class VarEx2
{
    public static void main(String[] args)
    {
        int x = 10, y = 20; // 변수 초기값
        int tmp = 0; // 임시 저장소

        System.out.println("x: " + x + " y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}