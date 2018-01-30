package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		CalDay testday1 = new CalDay();
		assertEquals(false, testday1.isValid());
		
		
		
		
		//testday.CalDay(cald);
		//testday.addAppt()
		
		
	 }
	 
	 
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=22;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt apple = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
				 
		GregorianCalendar cald = new GregorianCalendar();
		CalDay testday2 = new CalDay(cald);
		testday2.addAppt(apple);
		assertEquals(2018, testday2.getYear());
		//assertEquals(null,testday2.iterator());
		assertEquals(true, testday2.isValid());
		assertEquals(0, testday2.getMonth());
		assertEquals(29, testday2.getDay());
		

		assertEquals(true, testday2.getSizeAppts());
		
		assertEquals(true, testday2.getAppts());
		
		assertEquals(true, testday2.toString());
	 }
//add more unit tests as you needed	
}
