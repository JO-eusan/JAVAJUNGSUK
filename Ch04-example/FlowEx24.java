/* countdown */

class FlowEx24 
{
    public static void main(String[] args)
    {
        int i = 11;

        System.out.println("Countdown Start");

        while(i--!=0)
        {
            System.out.println(i);
            
            // 시간 지연
            for(int j=0; j<2_000_000_000;j++)
            {
                ;
            }
        }

        System.out.println("GAME OVER");
    }    
}
