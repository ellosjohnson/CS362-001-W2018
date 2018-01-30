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
		 	LinkedList<Appt> appts=new LinkedList<Appt>();
		 	appts.add(new Appt(21,30,22,1,2000,"day1","asdfjasl"));
			appts.add(new Appt(21,30,13,1,2000,"day2","asdfjas2"));
			
			int startHour=21;
			 int startMinute=30;
			 int startDay=15;
			 int startMonth=01;
			 int startYear=2000;
			 String title="Birthday Party";
			 String description="This is my birthday party.";
			 //Construct a new Appointment object with the initial data	 
			Appt test1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
			
			appts.add(new Appt(startHour,startMinute,startDay,startMonth,startYear,title,description));
			
			
		
			int year1 = 2000;
			int day1 = 20;
			int month1 =1; 
			int year2 = 2000;
			int day2 = 30;
			int month2 =1; 
		 	GregorianCalendar greg1=new GregorianCalendar(year1,month1,day1);
		 	GregorianCalendar greg2=new GregorianCalendar(year2,month2,day2);
		 	TimeTable timetest= new TimeTable();
		 	timetest.getApptRange(appts,greg1,greg2);
			
			LinkedList<Appt> appts2=new LinkedList<Appt>();
		 	appts2.add(new Appt(21,30,22,1,2000,"day1","asdfjasl"));
			appts2.add(new Appt(21,30,13,1,2000,"day2","asdfjas2"));
			

			
			assertEquals(null, timetest.deleteAppt(appts, null ));
			assertEquals(appts2, timetest.deleteAppt(appts, test1 ));
			
			int [] arr ={1,0};
			assertEquals(appts2, timetest.permute(appts, arr ));
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed
}
