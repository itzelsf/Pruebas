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
 * Script Name   : <b>Script7</b><br>
 * Generated     : <b>2018/07/19 10:02:28</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 amd64 6.1 <br>
 * 
 * @since  julio 19, 2018
 * @author DELL
 */
public abstract class Script7Helper extends RationalTestScript
{
	/**
	 * Schubert4_14Jpg: with default state.
	 *		.class : javax.swing.JLabel
	 * 		iconDescription : Schubert4_14.jpg
	 * 		.classIndex : 2
	 */
	protected GuiTestObject schubert4_14Jpg() 
	{
		return new GuiTestObject(
                        getMappedTestObject("schubert4_14Jpg"));
	}
	/**
	 * Schubert4_14Jpg: with specific test context and state.
	 *		.class : javax.swing.JLabel
	 * 		iconDescription : Schubert4_14.jpg
	 * 		.classIndex : 2
	 */
	protected GuiTestObject schubert4_14Jpg(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("schubert4_14Jpg"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point Schubert4_14Jpg_icontext object in the SUT.
	 */
	protected IFtVerificationPoint Schubert4_14Jpg_icontextVP() 
	{
		return vp("Schubert4_14Jpg_icontext");
	}
	protected IFtVerificationPoint Schubert4_14Jpg_icontextVP(TestObject anchor)
	{
		return vp("Schubert4_14Jpg_icontext", anchor);
	}
	
	

	protected Script7Helper()
	{
		setScriptName("Script7");
	}
	
}

