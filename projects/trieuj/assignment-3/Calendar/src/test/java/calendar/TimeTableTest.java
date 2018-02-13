package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 
		TimeTable times = new TimeTable(); 
		 
		LinkedList<CalDay> test = new LinkedList<CalDay>();
		
		LinkedList<Appt> rawr=new LinkedList<Appt>();
		 
			
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
		 int startDay2=17;
		 int startMonth2=01;
		 int startYear2=2018;
		 String title2="Birthday Party2";
		 String description2="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
				 		 
		int startYear3=2019;
		Appt appt3 = new Appt(startHour2,
		          startMinute2 ,
		          02 ,
		          04 ,
		          startYear3 ,
		          title2,
		         description2);
				 
		 rawr.add(appt);
		 rawr.add(appt2);
		 rawr.add(appt3);
		 
		 GregorianCalendar greg1=new GregorianCalendar(startYear,startMonth,startDay-1);
		 GregorianCalendar greg2=new GregorianCalendar(startYear2,startMonth2,startDay2+1);
		 
		assertNotNull(times.getApptRange(rawr,greg1,greg2));
		//assertNotNull(times.getApptRange(rawr,greg2,greg1));

		
		//assertNotNull(times.getApptOccurences(appt, greg1,greg2));
		//assertNotNull(times.getApptOccurences(appt, greg2,greg1));
		assertNotNull(times.getApptRange(rawr,greg1,greg2));
		
		int[] recurDaysArr={2,3,4};
		appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		assertNotNull(times.getApptRange(rawr,greg1,greg2));
		
		appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_BY_YEARLY);
		assertNotNull(times.getApptRange(rawr,greg1,greg2));
		appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_MONTHLY, 2, Appt.RECUR_BY_YEARLY);
		assertNotNull(times.getApptRange(rawr,greg1,greg2));
		//assertNotNull(times.getNextApptOccurrence(appt,greg1));
		rawr.add(appt);
		rawr.add(appt);
	    int[] j={0,2,1,3,4};
		assertNotNull(times.permute(rawr, j));
		
		times.deleteAppt(rawr, appt2);
		
		
		assertNull(times.deleteAppt(rawr,null));
		assertNull(times.deleteAppt(null,null));
		
		
	 }
	 @Test
	  public void test02()  throws Throwable  { 
		 		
		
		
		
		
		
		 	/* TimeTable timetest= new TimeTable();
		 	timetest.getApptRange(appts,greg1,greg2);
			
			LinkedList<Appt> appts2=new LinkedList<Appt>();
		 	appts2.add(new Appt(21,30,22,1,2000,"day1","asdfjasl"));
			appts2.add(new Appt(21,30,13,1,2000,"day2","asdfjas2"));
			

			
			assertEquals(null, timetest.deleteAppt(appts, null ));
			assertEquals(appts2, timetest.deleteAppt(appts, test1 ));
			
			int [] arr ={1,0};
			assertEquals(appts2, timetest.permute(appts, arr ));  */
	 }
//add more unit tests as you needed
}
