package Demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (Test_ITestListener.class)
public class ItestlesnerData {
	
	@Test
	public void Take1() {
    System.out.println("take1");
    Assert.assertTrue(false, "Fails");
	}
   @Test
   public void Take2() {
	   System.out.println("Take2");
   }
   @Test
   public void Take3() {
	   System.out.println("Take3");
	   
   }
   @Test
   public void Take4() {
	   System.out.println("take4");
   }
   
   @Test
   public void Take5() {
	   System.out.println("Take5");
   }
}
