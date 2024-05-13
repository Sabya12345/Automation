package betterAssertion;

import org.testng.annotations.Test;

public class SoftAssert 
{
	@Test
	public void m3()
	{
		String s1="hii";
		String s2="hello";
		
		//soft assert object creation
		SoftAssert s =new SoftAssert();
		s.assertEquals(s1,s2,"both are not matching");// fails the tc
		
		// after failing
		System.out.println("i will execute after failing");
	}

	private void assertEquals(String s1, String s2, String string) {
		// TODO Auto-generated method stub
		
	}
}
