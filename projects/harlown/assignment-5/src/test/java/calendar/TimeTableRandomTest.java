package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 int TestTimeout = 60 * 50 * 1;
		 int NUM_TESTS=100;
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 
				 TimeTable lala = new TimeTable();
				 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
						 
				 Appt appt2 = new Appt(startHour-1,
				          startMinute-1 ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				 Appt appt3 = new Appt(startHour+1,
				          startMinute+1 ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				Appt appt4 = new Appt(startHour+1,
				          startMinute+1 ,
				          startDay+5 ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				Appt appt5 = new Appt(startHour+1,
				          startMinute+100 ,
				          startDay-1 ,
				          startMonth ,
				          startYear ,
				          title,
				         description);			
			GregorianCalendar cal = new GregorianCalendar();
				 CalDay testday = new CalDay(cal);	


			GregorianCalendar firstDay = new GregorianCalendar(startYear,startMonth,startDay-1);
			GregorianCalendar lastDay = new GregorianCalendar(startYear,startMonth,startDay+1);	
			
			 if(!appt.getValid())continue;	
				testday.addAppt( appt );
				testday.addAppt( appt2 );
				testday.addAppt( appt3 );
			 if(!appt4.getValid())continue;
				testday.addAppt( appt4 );
				testday.addAppt( appt5 );
				lala.getApptRange(testday.getAppts(),firstDay,lastDay);
				//lala.getApptRange(testday.getAppts(),lastDay,firstDay);
				lala.deleteAppt(testday.getAppts(),appt3);
				lala.deleteAppt(testday.getAppts(),null);
				lala.deleteAppt(testday.getAppts(),appt5);
				lala.deleteAppt(null,appt5);
				
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}
			
			
		 }catch(NullPointerException e){
			
		} 
	 
		 System.out.println("Done testing...");
	 }


	
}
