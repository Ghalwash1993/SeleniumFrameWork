package ghuru;
import org.testng.annotations.Test;

public class ghuru2 extends Testghuru{

	@Test
	public void TestingGuruSite() throws InterruptedException
	{

		ghuru2Page gu=new ghuru2Page(driver);
		gu.Register();

	}
}
