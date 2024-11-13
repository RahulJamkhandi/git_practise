package pack1;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test
	public void createContactTest() 
	{
		System.out.println("A test to create contact");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

	@Test
	public void modifyContactTest() {
		System.out.println("A test to modify contact");
	}
	
	@Test
	public void editContactTest() {
		System.out.println("A test to edit contact");
	}
	
	@Test
	public void deleteContactTest() {
		System.out.println("A test to delete contact");
	}
}
