package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_in_testNG_2D_Arrays2 {

	@Test (dataProvider="test01")
	public void test (Object s1,Object s2,Object s3) {
		System.out.print(s1);
		System.out.print("_");
		System.out.print(s2);
		System.out.print("-");
		System.out.print(s3);
		System.out.println();
		
	

	}
	
@DataProvider(name ="test01")
public Object[][] case01() {
	Object[] []s=new Object[][]{ 
	{13,"Good",32},
	{12,"Best",987},
	{14,"Batter",987}};
	return s;

}
}