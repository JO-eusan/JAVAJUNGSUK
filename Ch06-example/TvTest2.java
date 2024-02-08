/* Tv 채널 변경 */

class Tv2
{
    // Tv의 속성(멤버변수)
    String color; // 색상
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    // Tv의 기능(메서드)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class TvTest2 
{
    public static void main(String[] args)
    {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("현재 t1의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("현재 t2의 channel값은 " + t2.channel + " 입니다.");

        t1.channel = 7; // t1의 채널을 7로 변경
        System.out.println("t1의 channel값을 " + t1.channel + "로 변경하였습니다.");

        System.out.println("현재 t1의 channel값은 " + t1.channel + " 입니다.");
        System.out.println("현재 t2의 channel값은 " + t2.channel + " 입니다.");
    }    
}
