/* 현재 시간은? */

import java.text.SimpleDateFormat;
import java.util.Date;

class ImportTest 
{
    public static void main(String[] args)
    {
        Date today = new Date(); // 현재 정보

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }    
}
