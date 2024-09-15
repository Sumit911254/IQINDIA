package testNGcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test (dataProvider="lenevo")
public class DataProviderDemo {
	public void Dell(String s1) {
		System.out.println(s1);

}
@DataProvider(name="lenevo")
public Object Asus() {
	String s[]=new String[] {"qa","dev","qc"};
	return s;
}
}