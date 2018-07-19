
import resources.Script2Helper;
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
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>18/07/2018 15:59:24</b>
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
		tree2().click(atRow(atPath("Composers->Mozart")), atPoint(5,8));
		tree2().click(atPath("Composers->Mozart->Concerto in D for Piano"));
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().click(atText("Emma Trenchenza"));
		password().click(atPoint(62,8));
		memberLogon().inputChars("890");
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(51,15));
		placeAnOrder().inputChars("3");
		expirationDate().doubleClick(atPoint(27,8));
		placeAnOrder().inputChars("20");
		creditCombo().click(atPoint(77,8));
		creditCombo().click();
		creditCombo().click(atText("Amex"));
		placeOrder2().click();
	}
}

