package DataProvider;

import org.testng.annotations.DataProvider;

public class datasupply {
	@DataProvider( name="testfire.net")
	public  Object[][] iqoo(){
	Object[][] s=new Object [][] {{"jsmith","demo@12"},
			                     {"jsmith","dem123"},
			                     {"jsmih","demo@123"},
			                     {"jsmith","demo123"}};
		return s;
		/*
		 * }
		 * 
		 * @DataProvider(name="Gtccab") public static Object[][] vivo(){ Object[][]
		 * s=new Object [][] {{"sumitkumar273413mail.com","1234"},
		 * {"sumitkumar213@gmail.com","7654"}, {"sumitkumar273@gmail.com","9876"},
		 * {"sumitkumar273413@gmail.com","1234"}}; return s;
		 */
}
}