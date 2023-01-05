package mentor;

import java.time.LocalDateTime;

class DateTime
{
  public static void main ( String [] args )
  {
    LocalDateTime date = LocalDateTime.now();
    System.out.println("\nIt is now " + date );

    date = date.withYear( 2019 );
    System.out.println("\nDate is now " + date );

    String fields = "\nYear:\t\t\t" + date.getYear();
    fields += "\nMonth:\t\t\t" + date.getMonth();
    fields += "\nMonth Number:\t\t" + date.getMonthValue();

    fields += "\nDay:\t\t\t" + date.getDayOfWeek();
    fields += "\nDay Number:\t\t" + date.getDayOfMonth();
    fields += "\nDay Number Of Year:\t" + date.getDayOfYear();

    fields += "\nHour(0-23):\t\t" + date.getHour();
    fields += "\nMinute:\t\t\t" + date.getMinute();
    fields += "\nSecond:\t\t\t" + date.getSecond();

    System.out.println( fields );
  } 
}