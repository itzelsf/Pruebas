
import resources.Script3Helper;
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
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>18/07/2018 16:10:16</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Admin->Products..."));
		
		// Frame: Administration
		password().click(atPoint(39,3));
		administration().inputChars("890");
		ok().click();
		
		// Frame: View Products
		productTable().setState(Action.vScroll(59));
		productTable().click(atCell(atRow("PRODID", "84763", "COMPOSER", 
                                    "Schubert", "COMPOSITION", 
                                    "Symphonies Nos. 5 & 9"), 
                              atColumn("DESCRIPTION")), 
                       atPoint(48,12));
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Order"));
		tree2().click(atRow(atPath("Composers->Schubert")), atPoint(126,13));
		tree2().click(atRow(atPath("Composers->Haydn")), atPoint(115,3));
		tree2().doubleClick(atPath("Composers->Schubert"));
		tree2().click(atPath("Composers->Schubert->Symphonies Nos. 5 & 9"));
		album().click(atText("Details"));
		// TabbedPage
		description().doubleClick(atPoint(172,11));
		details().click(atPoint(169,139));
		placeOrder().click();
		
		// Frame: Member Logon
		newCustomer().click();
		ok2().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(41,16));
		placeAnOrder().inputChars("90");
		expirationDate().click(atPoint(39,9));
		placeAnOrder().inputChars("20");
		name().click(atPoint(114,11));
		placeAnOrder().inputChars("xd");
		street().click(atPoint(68,8));
		placeAnOrder().inputChars("hji");
		cityStateZip().click(atPoint(55,16));
		placeAnOrder().inputChars("nim.zip");
		phone().click(atPoint(43,5));
		placeAnOrder().inputChars("67895432");
		placeOrder2().click();
		
		// 
		aceptar().drag();
	}
}

