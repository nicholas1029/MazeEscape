/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.jhotdraw.test.util.collections.jdk11;

import junit.framework.TestCase;
// JUnitDoclet begin import
import org.jhotdraw.figures.RectangleFigure;
import org.jhotdraw.figures.PolyLineFigure;
import org.jhotdraw.util.collections.jdk11.IteratorWrapper;

import java.util.Vector;
import java.awt.*;
// JUnitDoclet end import

/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/

// JUnitDoclet begin javadoc_class
/**
* TestCase IteratorWrapperTest is generated by
* JUnitDoclet to hold the tests for IteratorWrapper.
* @see org.jhotdraw.util.collections.jdk11.IteratorWrapper
*/
// JUnitDoclet end javadoc_class
public class IteratorWrapperTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private IteratorWrapper iteratorwrapper;
	// JUnitDoclet end class

	/**
	* Constructor IteratorWrapperTest is
	* basically calling the inherited constructor to
	* initiate the TestCase for use by the Framework.
	*/
	public IteratorWrapperTest(String name) {
		// JUnitDoclet begin method IteratorWrapperTest
		super(name);
		// JUnitDoclet end method IteratorWrapperTest
	}

	/**
	* Factory method for instances of the class to be tested.
	*/
	public IteratorWrapper createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		Vector v = new Vector();
		v.add(new RectangleFigure(new Point(10, 10), new Point(100, 100)));
		v.add(new PolyLineFigure(20, 20));
		v.add(new RectangleFigure(new Point(100, 10), new Point(150, 100)));
		return new IteratorWrapper(v.elements());
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	* Method setUp is overwriting the framework method to
	* prepare an instance of this TestCase for a single test.
	* It's called from the JUnit framework only.
	*/
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		iteratorwrapper = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	* Method tearDown is overwriting the framework method to
	* clean up after each single test of this TestCase.
	* It's called from the JUnit framework only.
	*/
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		iteratorwrapper = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method hasNext()
	/**
	* Method testHasNext is testing hasNext
	* @see org.jhotdraw.util.collections.jdk11.IteratorWrapper#hasNext()
	*/
	// JUnitDoclet end javadoc_method hasNext()
	public void testHasNext() throws Exception {
		// JUnitDoclet begin method hasNext
		// JUnitDoclet end method hasNext
	}

	// JUnitDoclet begin javadoc_method next()
	/**
	* Method testNext is testing next
	* @see org.jhotdraw.util.collections.jdk11.IteratorWrapper#next()
	*/
	// JUnitDoclet end javadoc_method next()
	public void testNext() throws Exception {
		// JUnitDoclet begin method next
		// JUnitDoclet end method next
	}

	// JUnitDoclet begin javadoc_method remove()
	/**
	* Method testRemove is testing remove
	* @see org.jhotdraw.util.collections.jdk11.IteratorWrapper#remove()
	*/
	// JUnitDoclet end javadoc_method remove()
	public void testRemove() throws Exception {
		// JUnitDoclet begin method remove
		// JUnitDoclet end method remove
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	* JUnitDoclet moves marker to this method, if there is not match
	* for them in the regenerated code and if the marker is not empty.
	* This way, no test gets lost when regenerating after renaming.
	* <b>Method testVault is supposed to be empty.</b>
	*/
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}
}
