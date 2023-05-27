package testNGpacakes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void a() {
	  Reporter.log("A Method",true);
	
  }
  @Test
  public void b() {
	  Reporter.log("B Method",true);
	
  }
  @Test
  public void c() {
	  Reporter.log("C Method",true);
	
  }
}
