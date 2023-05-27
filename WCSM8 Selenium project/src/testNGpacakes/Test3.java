package testNGpacakes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void f() {

	  Reporter.log("F Method",true);
  }
  @Test
  public void g() {

	  Reporter.log("G Method",true);
  }
}
