package testNGcode;

import org.testng.annotations.Test;

public class priorityintestNG2 {
@Test
public void signin() {
	System.out.println("inside signin");
}
@Test
public void searchflight() {
	System.out.println("search flight");
}
	@Test
	public void bookticket() {
		System.out.println("bookticket");
	}
		@Test
		public void details() {
			System.out.println("details");
		}
			@Test
			public void payments () {
				System.out.println("payment");
			}
				@Test 
				public void print() {
					System.out.println("print");
}
}