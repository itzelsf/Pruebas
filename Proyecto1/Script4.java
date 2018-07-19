
import resources.Script4Helper;
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
public class Script4 extends Script4Helper
{
	/**
	 * Script Name   : <b>Script4</b>
	 * Generated     : <b>18/07/2018 16:17:15</b>
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
		tree2().click(atRow(atPath("Composers->Mozart")), atPoint(107,5));
		tree2().click(atRow(atPath("Composers->Mozart")), atPoint(17,7));
		tree2().click(atPath("Composers->Mozart->Location(PLUS_MINUS)"));
		album().drag(atText("Details"));
		tree2().click(atRow(atPath("Composers->Mozart->Concerto in D for Piano")), 
                atPoint(175,3));
		tree2().drag(atPath("Composers->Mozart->Concerto in D for Piano"));
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().drag(atText("Rick Tumbler"));
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(46,9));
		expirationDate().click(atPoint(20,2));
		placeAnOrder().inputChars("20");
		creditCombo().click(atPoint(77,12));
		creditCombo().click();
		creditCombo().click(atText("Amex"));
		placeOrder2().click();
		placeAnOrder(ANY,DISABLED).clickDisabled();
		
		// 
		incompleteOrder().click(atPoint(112,1));
		aceptar().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(72,17));
		placeAnOrder().inputChars("25");
		placeOrder2().click();
		
		// 
		aceptar2().click();
	}
}

