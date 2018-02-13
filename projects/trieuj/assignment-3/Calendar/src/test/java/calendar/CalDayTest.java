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
		  
		GregorianCalendar lala = new GregorianCalendar();
		
		CalDay cal = new CalDay( lala);
		
		assertEquals(12,cal.getDay());
		assertEquals(1,cal.getMonth());
		assertEquals(2018,cal.getYear());
		//assertFalse(cal.CalDay());
	 }
	 @Test
	  public void test02()  throws Throwable  {
		  
		 GregorianCalendar lala = new GregorianCalendar();
		
		 CalDay cal = new CalDay(lala);
		 //CalDay cal2 = new CalDay(lala);

		 int startHour=15;
		 int startMinute=15;
		 int startDay=19;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday2 Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 
		 
		 
		 cal.addAppt(appt);
		 appt.setStartMonth(07);
		 cal.addAppt(appt);
		 assertEquals(2, cal.getSizeAppts());
		 assertTrue(cal.isValid());
	 }
	 @Test
	 public void test03()  throws Throwable  {
		 GregorianCalendar lala = new GregorianCalendar();
		
		 CalDay cal = new CalDay( lala);
		 
		 String str =  cal.toString();
		 
		
		 
		 assertEquals( str ,cal.toString());
		 
		// Iterator<?> blah;
		 
		 assertNotNull(cal.iterator());
		 
		 //cal.CalDay();
		 //assertFalse(cal.CalDay());
		 
		 
	 }
	 @Test
	  public void test04()  throws Throwable  {
		  CalDay cal = new CalDay( );
		  assertNull(cal.iterator());
		  assertNotNull(cal.toString());
		  
	  }
//add more unit tests as you needed	
}
