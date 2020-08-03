package ghuru;

import org.testng.annotations.Test;

public class ghuru4 extends Testghuru {
	
	@Test
	public void PrintOrderPdf() throws InterruptedException
	
	{
		ghuru4Page g=new ghuru4Page(driver);
		g.PrintPdf();
	}

}
