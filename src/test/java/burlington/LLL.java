package burlington;

import java.io.IOException;

import javax.imageio.IIOException;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LLL  implements ITestListener{
	@Test(dependsOnMethods="test1")
	void vv() {
		
	}
	@Test(priority=0)
	void dd() {
		
	}
	@Test(expectedExceptions= {IOException.class},priority=1)
	
	void test1() {
		
	}
	@Parameters("")
	@Test(groups="integration")
	void nn(String uname,String pw) {
		
	}
	@AfterTest
	void ff() {
		Assert.assertEquals("", "");
		
	}

}
