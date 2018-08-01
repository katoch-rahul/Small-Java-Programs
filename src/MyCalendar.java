import java.util.Calendar;

public class MyCalendar
{

public static void main(String args[])
{
	Calendar c=Calendar.getInstance();
	System.out.println("Current Year is "+c.get(Calendar.YEAR));
System.out.println("Current Month is "+c.get(Calendar.MONTH));
System.out.println("Current Date is "+c.get(Calendar.DATE));
System.out.println("Current Hour is "+c.get(Calendar.HOUR));
System.out.println("Current Minute is "+c.get(Calendar.MINUTE));
System.out.println("Current Second is "+c.get(Calendar.SECOND));
}

}