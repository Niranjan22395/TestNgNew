package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	
  @Test
  public void fetws() {
	  System.out.println("fetws");
  }
  
  
  @Parameters({"Browser"})
  @BeforeSuite
  public void beforeSuite(String Browsernae) {
	  System.out.println("Before Suite");
	  System.out.println("Browserr "+Browsernae);
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
