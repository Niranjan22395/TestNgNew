package TestNGG;

import org.testng.annotations.Test;

public class NewTestTestNG {
  @Test (priority =1, groups = "smoke" )
  public void TesNg1() {
	  System.out.println("TestNg1");
  }
  @Test (priority =3, groups = "smoke" )
  public void TesNg3() {
	  System.out.println("TestNg3");
  }
  @Test (priority =2, groups = "regression" )
  public void TesNg2() {
	  System.out.println("Testn2");
  }
  
}
