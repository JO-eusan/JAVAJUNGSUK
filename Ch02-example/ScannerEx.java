/* Scanner클래스 사용 */

import java.util.*; // Scanner클래스를 추가

class ScannerEx 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 하나 입력해주세요 > ");
        String input = scanner.nextLine();

        int num = Integer.parseInt(input); // string type -> int type

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        scanner.close();
    }
}
