package testNGcode;

import org.testng.annotations.Test;

public class priorityintestNG {
@Test(priority =5)
public void signin() {
	System.out.println("inside signin");
}
@Test(priority =1)
public void searchflight() {
	System.out.println("search flight");
}
	@Test(priority =3)
	public void bookticket() {
		System.out.println("bookticket");
	}
		@Test(priority =4)
		public void details() {
			System.out.println("details");
		}
			@Test(priority =0)
			public void payments () {
				System.out.println("payment");
			}
				@Test (priority =2)
				public void print() {
					System.out.println("print");
}
}