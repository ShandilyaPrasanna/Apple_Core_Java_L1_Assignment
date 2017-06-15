package corejavaL1;

import java.time.*;

public class DateTimeDemo
{
  public static void main(String[] args)
  {
      LocalDate localDate = LocalDate.of(1989, Month.APRIL, 5);
      System.out.println("Date Of Birth: "+localDate.getDayOfWeek()+", "+localDate.getMonth()+" "+localDate.getDayOfMonth()+", "+localDate.getYear());
      localDate = localDate.plusDays(90);
      System.out.println("After 90 Days: "+localDate.getDayOfWeek()+", "+localDate.getMonth()+" "+localDate.getDayOfMonth()+", "+localDate.getYear());
  }
}