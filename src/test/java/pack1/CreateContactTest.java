package pack1;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContactTest() 
	{
		System.out.println("A test to create contact");
		String URL = System.getProperty("url","localhost://8088");
		String BROWSER = System.getProperty("browser","chrome");
		String USERNAME = System.getProperty("username","admin");
		String PASSWORD = System.getProperty("password","manager");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

	@Test
	public void modifyContactTest() {
		System.out.println("A test to modify contact");
	}
}
