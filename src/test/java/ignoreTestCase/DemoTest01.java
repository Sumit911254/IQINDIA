package ignoreTestCase;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoTest01 {

@Test
public void testcase01() {
	System.out.println("Inside TC01");
}
@Ignore
@Test
public void testcase02() {
	System.out.println("Inside TC02");
}
@Test
public void testcase03() {
	System.out.println("Inside TC03");

}
@Test
public void testcase04() {
	System.out.println("Inside TC04");

}
@Ignore
@Test
public void testcase05() {
	System.out.println("Inside TC05");
}
}