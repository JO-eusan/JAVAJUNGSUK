/* 로또번호 생성 (섞기) */

class ArrayEx7 
{
    public static void main(String[] args)
    {
        int[] ball = new int[45]; // 크기가 45인 배열 생성

        // 배열 요소 초기화
        for(int i=0; i<ball.length; i++)
        {
            ball[i] = i+1; // 1~45로 초기화
        }

        // shuffle(0~5요소만 변경)
        int tmp = 0; // 두 값을 바꾸는데 사용할 임시 변수

        for(int i=0; i<6; i++)
        {
            int j = (int)(Math.random() * 45); // 임의의 값을 얻어 저장할 변수
            tmp = ball[i]; // 바꿀 index(in 0~5 index)
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        // 결과 출력
        System.out.print("추첨 번호: ");
        
        for(int i=0; i<6; i++)
        {
            System.out.printf("%d ", ball[i]);
        }
    }    
}
