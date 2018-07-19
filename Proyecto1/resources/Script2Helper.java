// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Script2</b><br>
 * Generated     : <b>2018/07/18 16:00:26</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 amd64 6.1 <br>
 * 
 * @since  julio 18, 2018
 * @author DELL
 */
public abstract class Script2Helper extends RationalTestScript
{
	/**
	 * CardNumberIncludeTheSpaces: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Card Number (include the spaces):
	 * 		name : .cardNumberField
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject cardNumberIncludeTheSpaces() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("cardNumberIncludeTheSpaces"));
	}
	/**
	 * CardNumberIncludeTheSpaces: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Card Number (include the spaces):
	 * 		name : .cardNumberField
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject cardNumberIncludeTheSpaces(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("cardNumberIncludeTheSpaces"), anchor, flags);
	}
	
	/**
	 * creditCombo: with default state.
	 *		.itemCount : 3
	 * 		.itemText : {Visa,Amex,Mastercard}
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : Card Type:
	 * 		name : creditCombo
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject creditCombo() 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("creditCombo"));
	}
	/**
	 * creditCombo: with specific test context and state.
	 *		.itemCount : 3
	 * 		.itemText : {Visa,Amex,Mastercard}
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : Card Type:
	 * 		name : creditCombo
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject creditCombo(TestObject anchor, long flags) 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("creditCombo"), anchor, flags);
	}
	
	/**
	 * ExpirationDate: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Expiration Date:
	 * 		name : .expireField
	 * 		.classIndex : 4
	 */
	protected TextGuiSubitemTestObject expirationDate() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("expirationDate"));
	}
	/**
	 * ExpirationDate: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.priorLabel : Expiration Date:
	 * 		name : .expireField
	 * 		.classIndex : 4
	 */
	protected TextGuiSubitemTestObject expirationDate(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("expirationDate"), anchor, flags);
	}
	
	/**
	 * MemberLogon: with default state.
	 *		.captionText : Member Logon
	 * 		.class : javax.swing.JFrame
	 * 		accessibleContext.accessibleName : Member Logon
	 * 		.processName : javaw.exe
	 * 		name : logFrame1
	 */
	protected TopLevelTestObject memberLogon() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("memberLogon"));
	}
	/**
	 * MemberLogon: with specific test context and state.
	 *		.captionText : Member Logon
	 * 		.class : javax.swing.JFrame
	 * 		accessibleContext.accessibleName : Member Logon
	 * 		.processName : javaw.exe
	 * 		name : logFrame1
	 */
	protected TopLevelTestObject memberLogon(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("memberLogon"), anchor, flags);
	}
	
	/**
	 * nameCombo: with default state.
	 *		.itemCount : 16
	 * 		.itemText : {Trent Culpito,Susan Flontly,Emma Trenchenza,Claire Stratus,Rick Tumbler,Tony Mi ...
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : Full Name:
	 * 		name : nameCombo
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject nameCombo() 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("nameCombo"));
	}
	/**
	 * nameCombo: with specific test context and state.
	 *		.itemCount : 16
	 * 		.itemText : {Trent Culpito,Susan Flontly,Emma Trenchenza,Claire Stratus,Rick Tumbler,Tony Mi ...
	 * 		.class : javax.swing.JComboBox
	 * 		.priorLabel : Full Name:
	 * 		name : nameCombo
	 * 		.classIndex : 0
	 */
	protected TextSelectGuiSubitemTestObject nameCombo(TestObject anchor, long flags) 
	{
		return new TextSelectGuiSubitemTestObject(
                        getMappedTestObject("nameCombo"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName :   OK  
	 * 		name : ok-orderlogon
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName :   OK  
	 * 		name : ok-orderlogon
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
	}
	
	/**
	 * Password: with default state.
	 *		.class : javax.swing.JPasswordField
	 * 		.priorLabel : Password:
	 * 		name : .passText2
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject password() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("password"));
	}
	/**
	 * Password: with specific test context and state.
	 *		.class : javax.swing.JPasswordField
	 * 		.priorLabel : Password:
	 * 		name : .passText2
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject password(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("password"), anchor, flags);
	}
	
	/**
	 * PlaceAnOrder: with default state.
	 *		.captionText : Place an Order
	 * 		.class : javax.swing.JFrame
	 * 		accessibleContext.accessibleName : Place an Order
	 * 		.processName : javaw.exe
	 * 		name : orderForm
	 */
	protected TopLevelTestObject placeAnOrder() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("placeAnOrder"));
	}
	/**
	 * PlaceAnOrder: with specific test context and state.
	 *		.captionText : Place an Order
	 * 		.class : javax.swing.JFrame
	 * 		accessibleContext.accessibleName : Place an Order
	 * 		.processName : javaw.exe
	 * 		name : orderForm
	 */
	protected TopLevelTestObject placeAnOrder(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("placeAnOrder"), anchor, flags);
	}
	
	/**
	 * PlaceOrder: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Place Order
	 * 		name : placeOrderButton2
	 * 		.classIndex : 0
	 */
	protected GuiTestObject placeOrder() 
	{
		return new GuiTestObject(
                        getMappedTestObject("placeOrder"));
	}
	/**
	 * PlaceOrder: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Place Order
	 * 		name : placeOrderButton2
	 * 		.classIndex : 0
	 */
	protected GuiTestObject placeOrder(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("placeOrder"), anchor, flags);
	}
	
	/**
	 * PlaceOrder: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Place Order
	 * 		name : placeOrder
	 * 		.classIndex : 1
	 */
	protected GuiTestObject placeOrder2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("placeOrder2"));
	}
	/**
	 * PlaceOrder: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Place Order
	 * 		name : placeOrder
	 * 		.classIndex : 1
	 */
	protected GuiTestObject placeOrder2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("placeOrder2"), anchor, flags);
	}
	
	/**
	 * tree2: with default state.
	 *		.class : javax.swing.JTree
	 * 		name : tree2
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject tree2() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("tree2"));
	}
	/**
	 * tree2: with specific test context and state.
	 *		.class : javax.swing.JTree
	 * 		name : tree2
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject tree2(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("tree2"), anchor, flags);
	}
	
	

	protected Script2Helper()
	{
		setScriptName("Script2");
	}
	
}

