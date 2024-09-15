package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_in_testNG {
	@Test (dataProvider="gtc")
	public void Object (String s1) {
		System.out.println(s1);
		
	}

@DataProvider(name ="gtc")
public Object test() {
	String s[]=new String[] {"sumit","Shivam","qa"};
	return s;
}
}




