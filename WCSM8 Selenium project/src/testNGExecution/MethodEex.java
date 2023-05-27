package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodEex {
  @Test
  public void mwthod1() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId +": is a threadId of Method 1",true);
	  Reporter.log("Method1",true);
  }
  @Test
  public void mwthod2() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId +": is a threadId of Method 2",true);
	  Reporter.log("Method2",true);
  }
}
