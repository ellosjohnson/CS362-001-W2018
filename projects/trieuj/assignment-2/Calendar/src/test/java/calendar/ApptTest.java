package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription()); 
		 
		 
		// assertEquals(longmessage,appt.toString());
		 assertEquals(0, appt.compareTo(appt));
		 //recurring Days
		 int[] recurDaysArr={2,3,4};
		 appt.setRecurrence( recurDaysArr, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
		 
		 assertEquals( 1000 , appt.getRecurNumber());
		 assertEquals( 1 , appt.getRecurBy());
		 assertEquals( recurDaysArr, appt.getRecurDays());
		 assertEquals(true, appt.isRecurring());
		 assertEquals(2, appt.getRecurIncrement());
		 appt.setRecurrence( null, appt.RECUR_BY_WEEKLY, 2, appt.RECUR_NUMBER_FOREVER);
		
		 
		 
		 int hour = 10;
		 int minute = 24;
		 int day = 07;
		 int month = 06;
		 int year = 2008;
		 String testword ="hello";
		 appt.setStartHour(hour);
		 appt.setStartMinute(minute);
		 appt.setStartDay(day);
		 appt.setStartMonth(month);
		 appt.setStartYear(year);
		 appt.setTitle(testword);
		 appt.setDescription(testword);
		 
		 
		 
		 
		 
		 assertEquals(hour, appt.getStartHour());
		 assertEquals(minute, appt.getStartMinute());
		 assertEquals(day, appt.getStartDay());
		 assertEquals(month, appt.getStartMonth());
		 assertEquals(year, appt.getStartYear());
		 assertEquals(testword, appt.getTitle());
		 assertEquals(testword, appt.getDescription());
		 
		 appt.setTitle(null);
		 appt.setDescription(null);
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());
		 
		 assertEquals(false, appt.getValid());
		 
		 
		 appt.setStartHour(22);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(99);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(99);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(99);
		 assertEquals(false, appt.getValid());
		 appt.setStartYear(9999);
		 assertEquals(false, appt.getValid());
		 
		 assertEquals( 0, appt.getRecurDays());
		// String longmessage = "\t"+ appt.getStartMonth()+"/"+appt.getStartDay()+"/"+appt.getStartYear() + " at "; +  appt.represntationApp()  + " ," +  appt.getTitle()+ ", "+  appt.getDescription()+"\n";
		 //assertEquals(longmessage,appt.toString());
		 
		 
		 
	  }
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour2=22;
		 int startMinute2=99;
		 int startDay2=99;
		 int startMonth2=55;
		 int startYear2=2018;
		 String title2="test day ";
		 String description2="This is a test.";
		 
		 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
	// assertions
		 assertTrue(appt2.getValid());
		 assertEquals(21, appt2.getStartHour());
		 assertEquals(30, appt2.getStartMinute());
		 assertEquals(22, appt2.getStartDay());
		 assertEquals(01, appt2.getStartMonth());
		 assertEquals(2018, appt2.getStartYear());
		 assertEquals("test day ", appt2.getTitle());
		 assertEquals("This is a test.", appt2.getDescription());      
	 }
	 @Test
	 public void test03()  throws Throwable  {
		 

	 }		 
}
