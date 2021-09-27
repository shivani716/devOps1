package loginTests;
import login.App;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
  @Test(description="Valid Test")
  public void validLoginTest() {
	  App ap=new App();
	  boolean status=ap.userLogin("userdemo","password");
	  Assert.assertTrue(status,"Login failed with valid Credential");
	  
  }
  
  @Test(description="InValid Test")
  public void invalidLoginTest() {
	  App ap=new App();
	  boolean status=ap.userLogin("userdemo","password123");
	  Assert.assertTrue(status);
	  
  }
  

}
