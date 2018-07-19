
import resources.Script8Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class Script8 extends Script8Helper
{
	/**
	 * Script Name   : <b>Script8</b>
	 * Generated     : <b>19/07/2018 10:16:40</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/19
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().doubleClick(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 5"));
		album().click(atText("Details"));
		// TabbedPage
		details().performTest(Details_standardVP());
		// TabbedPage
		symphonyNo5().performTest(SymphonyNo5_SymphonyNo5VP());
		float Album_alignmentX = ((Float)album2().getProperty("alignmentX")).floatValue();
		placeOrder().waitForExistence();
	}
}

