package GroupingInTestNG;

import org.testng.annotations.Test;

public class Demo1 {
	@Test(groups={"smoke","sanity"})
	public void tc01() {
		System.out.println("inside tc01");
	}
@Test(groups="sanity")
public void tc02() {
	System.out.println("inside tc02");
}
@Test(groups="weekly")
public void tc03() {
	System.out.println("inside tc03");
}
@Test(groups="dailybuild")
public void tc04() {
	System.out.println("inside tc04");
}
@Test(groups="monthly")
public void tc05() {
	System.out.println("inside tc05");
}
}
