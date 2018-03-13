package calendar;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 int TestTimeout = 60 * 50 * 1;
		 int NUM_TESTS=100000;
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random,0,13);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random,0,25);
				 int startDay=ValuesGenerator.getRandomIntBetween(random,0,35);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 

				 
				 
				 GregorianCalendar cal = new GregorianCalendar();
				 CalDay testday = new CalDay(cal);
				 //testday.CalDay(cal);
				 Appt appt = new Appt(startHour,
				          startMinute ,
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
						 
				Appt appt4 = new Appt(startHour-1,
				          startMinute-1 ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);		 
				//LinkedList<appt> linked = new LinkedList<appt>;
				if(!appt.getValid())continue;
					testday.addAppt( appt );
					testday.addAppt( appt3 );
					testday.addAppt( appt4 );
 	/* 			for (int i = 0; i < NUM_TESTS; i++) {
					 if(!appt.getValid()){;
						
						testday.addAppt( appt );
					 }
					 else{
					
						testday.addAppt( appt );
					 } 
				} */
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
	 }


	
}
