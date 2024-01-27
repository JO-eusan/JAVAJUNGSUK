/* 빈도수 구하기 */

class ArrayEx11 
{
    public static void main(String[] args)
    {
        int[] numArr = new int[10];
        int[] counter = new int[10]; // 횟수 저장 배열

        // 값 초기화
        System.out.print("배열: ");
        for(int i=0; i<numArr.length; i++)
        {
            numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 숫자를 저장
            System.out.printf("%d ", numArr[i]);
        }
        System.out.println();

        // 횟수 count
        for(int i=0; i<numArr.length; i++)
        {
            counter[numArr[i]]++;
        }

        // 결과 출력
        for(int i=0; i<counter.length; i++)
        {
            System.out.println(i + "의 개수: " + counter[i]);
        }

    }    
}
