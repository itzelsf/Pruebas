
import resources.Script1Helper;
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
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>18/07/2018 15:42:41</b>
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
		tree2().click(atPath("Composers->Beethoven"));
		// TabbedPage
		schubert4_14Jpg().click();
		album().drag(atText("Details"));
		details().drag(atText("Album"));
		tree2().click(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 9"));
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().click(atText("Emma Trenchenza"));
		ok().click();
		
		// Frame: Place an Order
		creditCombo().click();
		creditCombo().drag(atText("Mastercard"));
		placeOrder2().click();
		
		// 
		aceptar().click();
		
		// Frame: Place an Order
		relatedItems().click();
		
		// 
		similarSelections().close();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(43,2));
		placeAnOrder().inputChars("18");
		placeOrder2().click();
		
		// 
		incompleteOrder().click(atPoint(107,16));
		jOptionPane().click(atPoint(113,67));
		aceptar().click();
		
		// Frame: Place an Order
		cancel().click();
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		password().click(atPoint(57,6));
		memberLogon().inputChars("holaquehace");
		rememberPassword().clickToState(SELECTED);
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().doubleClick(atPoint(39,10));
		placeAnOrder().inputChars("20");
		creditCombo().click();
		creditCombo().click(atText("Mastercard"));
		expirationDate().click(atPoint(3,11));
		placeAnOrder().inputChars("13");
		placeOrder2().click();
		
		// 
		aceptar2().click();
	}
}

