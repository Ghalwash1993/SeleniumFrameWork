package ghuru;

import org.testng.annotations.Test;

public class ghuru3 extends Testghuru{
	@Test
	public void Purchasetest() throws InterruptedException
	{
		ghuru3Page g=new ghuru3Page(driver);
		g.Purchase();
	}

}
