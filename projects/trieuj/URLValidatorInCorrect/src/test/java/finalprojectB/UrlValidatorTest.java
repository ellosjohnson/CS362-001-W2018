
package finalprojectB;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;
//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {
  
   ResultPair[] pre = {		   new ResultPair("http://", true),
                               new ResultPair("https://", true),
                               new ResultPair("http:/", false),
                               new ResultPair("http:", false),
                               new ResultPair("http", false),
                               new ResultPair("asdf", false),
                               new ResultPair("", true),
                               new ResultPair("123", false)};
  
   ResultPair[] suf = {        new ResultPair("facebook.com", true),
                               new ResultPair("www.facebook.com", true),
                               new ResultPair("sadf", false),
                               new ResultPair("www.google", false),
                               new ResultPair("google", false),
                               new ResultPair(".com", false),
                               new ResultPair("", true),
                               new ResultPair("123", false),
							   new ResultPair("www.youtube.com/watch?v=dQw4w9WgXcQ",true)};

   //StringBuilder stringbuilder = new StringBuilder();
   //stringbuilder.append(part1[1]);
   //stringbuilder.append(part2[1]);
   //String url = stringbuilder.toString();

   
   @Test
   public void testManualTest(){
	//You can use this function to implement your manual testing
      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

	assertTrue(urlVal.isValid("http://www.google.com"));
	assertTrue(urlVal.isValid("http://www.google.comm/"));
	assertFalse(urlVal.isValid("LKMDFSKLJSDFLKJFDSLKJFDSLKJSDFKLJ"));
	assertTrue(urlVal.isValid("https.com"));
	assertTrue(urlVal.isValid("http://*./*/s32&7&#241"));
	assertFalse(urlVal.isValid("http://@(*(#@^$^&^*.ncasdf????"));
	


///////////////////////////////////////////////////////////////////////////////////////////////////////////
//bug 1 is that isValid will validate any URL that starts with http: "anything here works"
///////////////////////////////////////////////////////////////////////////////////////////////////////////	   
   }
   
   @Test
   public void testYourFirstPartition(){
	 //You can use this function to implement your First Partition testing	   
	 UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	assertTrue(urlVal.isValid("https://www.google.com"));
	assertTrue(urlVal.isValid("https://www.google.com/"));
	
	assertTrue(urlVal.isValid("https://www.youtube.com/watch?v=SGpBYsh-aBw&list=RDMMK73-hmaHPHY&index=10"));	//<--- bug
	assertTrue(urlVal.isValid("https://www.googlsdfsdfdfe.com/trtr")); 
    
	
	 //any url that has '/' character that doesnt have http: specifically is cant have to more then 1 '/'
	   
   }
   
   //You need to create more test cases for your Partitions if you need to 
   
   @Test
   public void testIsValid(){
	   //You can use this function for programming based testing
      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	  
      //assertTrue(urlVal.isValid("https://www.googlsdfsdfdfe.com/trtr"));
	  
      boolean expected=true;
     System.out.print("expect = true " + expected +" \n");
	  
	  System.out.print( "" );	  
	 
	  for( int i = 0; i < 8; i++){
		  for ( int j = 0; j < 9; j++){
				StringBuilder url = new StringBuilder();
			 	url.append(pre[i].item);
				url.append(suf[j].item);
				
				String url_string = url.toString();
				
				expected = ( (pre[i].valid) & (suf[j].valid) );
				
				System.out.print( expected + " ");
				System.out.print( pre[i].valid + " ");
				System.out.print( suf[j].valid + " ");
				//System.out.print( urlVal.isValid(url_string) + " ");
				System.out.print(url_string);
				
				System.out.print("\n");
				
				
				
				//assertEquals( expected, urlVal.isValid(url_string) );
		  
		  }
	  }
		  

		  
		  
		  
		  
		  

	  
      //url.append(pre[4].item);
      //url.append(suf[2].item);
      
      //url.append(suf[1].item);
      //String url2_string=url.toString();

      
      
      //System.out.print(url2_string);
     // expected &= suf[0].valid;
     // assertTrue(urlVal.isValid("SDFL;KJDFSALK;JDFSALJK;DSKL;JAFSD L;KJAFSD KL;JAFSDL;KJASDFL;JKADFSKL;JADFSL;JKADFSKLJ;FADSLJK;ADFSKL;JFADSKL;JFADSLK;JAFSDLJK;FADSKJL;AFDSKLJ;FADSFADSL;KJ"));
      //assertTrue(urlVal.isValid("http://www.google.com"));
      
      //String stuff=null;
      //assertFalse(urlVal.isValid(stuff));

      //assertFalse(urlVal.isValid("google"));
      //assertFalse(urlVal.isValid("www.google.com"));//www.google.com does not work and should
      //assertTrue(urlVal.isValid("http://google.com"));
     // assertTrue(urlVal.isValid("http:"));


   }
   

}