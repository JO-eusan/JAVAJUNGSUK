/* 학생 점수 판독기 */

import java.util.*;

class FlowEx4 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // 점수를 저장하기 위한 변수
        char grade = ' '; // 학점을 저장하기 위한 변수

        System.out.print("점수를 입력하세요 > ");
        score = scanner.nextInt();

        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else
            grade = 'D';
        
        System.out.println("당신의 학점은 " + grade + "입니다.");

        scanner.close();
    }
}
