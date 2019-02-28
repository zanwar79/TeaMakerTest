import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;

public class AccountTest {

//create object of class under test 
   private Account anAccount; 
	
   @Before
   public void setUp() throws Exception 
   {
      anAccount = new Account();
      DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
      anAccount._entries = new Hashtable<Date, Integer>();
      
      String str_d1="16-Jan-03";
      String str_d2="20-Jan-03";
      String str_d3="25-Jan-03";
      
      Date d1 = (Date) formatter.parse(str_d1);
      anAccount._entries.put(d1, new Integer(100));
      
      Date d2 = (Date) formatter.parse(str_d2);
      anAccount._entries.put(d2, new Integer(120));
      
      Date d3 = (Date) formatter.parse(str_d3);
      anAccount._entries.put(d3, new Integer(110));
   }

   @Test
   public void testgetSalesBetween() throws ParseException
   {
     
      DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
      
      String str_start="17-Jan-03";
      String str_end="30-Jan-03";
      
      Date start= (Date) formatter.parse(str_start);
      Date end= (Date) formatter.parse(str_end);

      assertEquals(230, anAccount.getSalesBetween(start, end));
   }
	

}
