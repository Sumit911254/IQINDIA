package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dell {
	@Test(dataProvider="gts")
	public void gtp(Object s1,Object s2) {
		System.out.println(s1);
		System.out.println("-");
		System.out.println(s2);
		System.out.println();
	

	
}
@DataProvider(name="gts")
public Object dtc() {
	Object s[][]=new Object[][] {{"lenovo","samsung"},
			                    {  121,321,}};
return s;
}}