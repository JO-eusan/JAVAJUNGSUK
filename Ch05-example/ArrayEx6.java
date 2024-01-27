/* 최대값과 최소값 */

class ArrayEx6 
{
    public static void main(String[] args)
    {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; // 최대값을 배열의 첫번째 값으로 초기화
        int min = score[0]; // 최소값을 배열의 첫번째 값으로 초기화

        for(int i=1; i<score.length; i++)
        {
            if(score[i] > max)
                max = score[i];
            else if(score[i] < min)
                min = score[i];
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
