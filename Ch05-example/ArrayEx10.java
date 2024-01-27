/* 정렬하기(sort) */

class ArrayEx10 
{
    public static void main(String[] args)
    {
        int[] numArr = new int[10];

        // 배열 초기화
        System.out.print("정렬 전: ");
        for(int i=0; i<numArr.length; i++)
        {
            numArr[i] = (int)(Math.random() * 10);
            System.out.printf("%d ", numArr[i]);
        }
        System.out.println();

        // sort
        for(int i=0; i<numArr.length-1; i++)
        {
            boolean changed = false; // 자리바꿈 check

            for(int j=0; j<numArr.length-1-i; j++)
            {
                if(numArr[j] > numArr[j+1]) // 다음 값과 비교했을 때 작으면 서로 change
                {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true; // 자리바꿈이 발생하면 changed를 true로 변경
                }
            }
            
            if(!changed) 
            {
                System.out.println("end");
                break; // 자리바꿈이 없으면 반복문 break
            }
            
            // 단계별로 결과 출력
            System.out.printf("#%d: ", i+1);
            for(int k=0; k<numArr.length; k++)
            {
                System.out.printf("%d ",numArr[k]);
            }
            System.out.println();
            
        }

    }    
}
