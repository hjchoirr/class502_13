package homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalTest2 {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;

        while(true) {
            System.out.print("년 월 입력 : ");
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            if(str.equals("exit")) break;

            String[] data = str.split("\\s+");
            year = Integer.parseInt(data[0]);
            month = Integer.parseInt(data[1]);

            System.out.printf("   ---------- %d년 %d월 ----------%n", year, month);
            System.out.println("  Sun  Mon  Tus  Wen  Thu  Fri  Sat");

            getCalendar(year, month);
        }
    }
    public static void getCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int sDayNum = date.getDayOfWeek().getValue();
        int eDateDay = date.plus(1,ChronoUnit.MONTHS).minus(1, ChronoUnit.DAYS).getDayOfMonth();

        for(int i = sDayNum; i <= eDateDay ; i ++) {

        }

    }
}
