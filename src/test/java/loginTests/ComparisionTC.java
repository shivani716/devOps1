package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparisionTC {
  @Test
  public void checkingComparision() {
	  Assert.assertTrue(50>6);
	  System.out.println("Testing done");
  }
  }

