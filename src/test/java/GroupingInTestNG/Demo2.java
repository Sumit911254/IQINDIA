package GroupingInTestNG;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups="smoke")
	public void tc06() {
		System.out.println("inside tc06");
	}
@Test(groups="regression")
public void tc07() {
	System.out.println("inside tc07");
}
@Test(groups="re testing")
public void tc08() {
	System.out.println("inside tc08");
}
@Test(groups="sanity")
public void tc09() {
	System.out.println("inside tc09");
}
@Test(groups="re testing")
public void tc10() {
	System.out.println("inside tc010");
}
}
