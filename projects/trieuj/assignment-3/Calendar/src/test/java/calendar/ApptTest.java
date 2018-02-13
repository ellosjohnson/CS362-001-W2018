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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	 // testing set functions
	  public void test02()  throws Throwable  {
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
				 
		 appt.setStartHour(10);
		 appt.setStartMinute(45);
		 appt.setStartDay(04);
		 appt.setStartMonth(07);
		 appt.setStartYear(2002);
		 appt.setTitle(null);
		 appt.setDescription(null);
		 
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(10, appt.getStartHour());
		 assertEquals(45, appt.getStartMinute());
		 assertEquals(04, appt.getStartDay());
		 assertEquals(07, appt.getStartMonth());
		 assertEquals(2002, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());   
	 }
	 // testing setRecurrence
	 @Test
	  public void test03()  throws Throwable  {
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
		  
		  int[] recurDaysArr={2,3,4};
		  appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		  
		  //asserts

		  
		  assertEquals(1000,appt.getRecurNumber());
		  assertEquals(1,appt.getRecurBy());
		  assertTrue(appt.isRecurring());
		  assertEquals(recurDaysArr,appt.getRecurDays());
		  assertEquals(2,appt.getRecurIncrement());
	  }
	  
	@Test  
	  public void test04()  throws Throwable  {
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
		 appt.setStartYear(2002);		 
		 
		 assertFalse(appt.isRecurring());
		 
		 appt.setStartMonth(5); 
		 assertEquals(5, appt.getStartMonth());
		 //assertFalse(appt.getValid());
		 appt.setStartDay(60);
		 assertEquals(60, appt.getStartDay());
		 assertFalse(appt.getValid());
		 appt.setStartDay(startDay);
		 
		 
		 appt.setStartMinute(99);
		 assertFalse(appt.getValid());
		 assertEquals(99, appt.getStartMinute());
		 appt.setStartMinute(startMinute);
		 
		 
		 appt.setStartHour(35);
		 assertFalse(appt.getValid());	
		 assertEquals(35, appt.getStartHour());
		 appt.setStartHour(startHour);
	
		
		 
		 appt.setStartDay(-4);
		 assertFalse(appt.getValid());
		 assertEquals(-4, appt.getStartDay());
		 appt.setStartDay(startDay);
		 
		 appt.setStartMinute(-10);
		 assertFalse(appt.getValid());
		 assertEquals(-10, appt.getStartMinute());
		 appt.setStartMinute(startMinute);
		 
		 appt.setStartHour(0);
		 assertFalse(appt.getValid());
		 assertEquals(0, appt.getStartHour());
		 appt.setStartHour(startHour);
		
   
	  }
	  @Test
	  public void test05()  throws Throwable  {
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
				 
				 
		 int startHour2=21;
		 int startMinute2=30;
		 int startDay2=13;
		 int startMonth2=01;
		 int startYear2=2018;
		 String title2="Birthday Party";
		 String description2="This is my birthday party.";		 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2); 
				 

		  appt.toString();
		  
		  
		  assertEquals( 2 ,appt.compareTo(appt2));
		  assertEquals( 0 ,appt.compareTo(appt));
		  assertNotNull(appt.compareTo(appt2));
		 
		 int startHour3=99;
		 int startMinute3=30;
		 int startDay3=13;
		 int startMonth3=01;
		 int startYear3=2018;
		 String title3="Birthday Party";
		 String description3="This is my birthday party.";	
		 
		 Appt appt3 = new Appt(startHour2,
		  startMinute2 ,
		  startDay2 ,
		  startMonth2 ,
		  startYear2 ,
		  title2,
		 description2); 
		 assertNotNull(appt.toString());
	  }
	  @Test
	  public void test06()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2000;
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
		
		Appt appt3 = new Appt(07,
			  27 ,
			  30 ,
			  02 ,
			  2000 ,
			  title,
			 description); 	
		 assertEquals( 1 ,appt.compareTo(appt3));	 
		appt.setStartMonth(2); 
		assertEquals(2, appt.getStartMonth());
		assertTrue(appt.getValid());
		appt.setStartDay(99); 
		assertNull(appt.toString());
		
		
	  }
//add more unit tests as you needed
	
}
