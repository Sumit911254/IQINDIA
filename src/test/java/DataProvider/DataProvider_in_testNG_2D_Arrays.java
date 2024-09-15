package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_in_testNG_2D_Arrays {
@DataProvider(name ="Sumit")
public Object[][] case01() {
	Object [][]s=new Object[][]{ 
	{"jsmith","demo12345"},
	{"jsmith","demo121"},
	{"Jsmith","demo1234"}};
	return s;
}
}