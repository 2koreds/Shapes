/**
 * 
 */
package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.tests.substitutes.MessageBoxSub;
import org.junit.Test;

/**
 * @author Matthew
 *
 */
public class CylinderUnitTest {

	@Test
	public void cylinderRender() {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(messageBoxSub);
		
		// 2. Act/Assert
		cylinder.render();
	}
	
	// Verifies that the cylinder getHeight() is obtainable
	@Test
	public void cylinderGetHeight() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(messageBoxSub);
		int expected = 15;
		// 2. Act
		cylinder.setHeight(15);
		// 3. Assert
		assertEquals("Cylinder width should be 15.", expected, (int)cylinder.getHeight());
	}
		
	// Verifies that cylinder getRadius() is obtainable
	@Test
	public void cylinderGetRadius() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(messageBoxSub);
		int expected = 10;
		// 2. Act
		cylinder.setRadius(10);
		// 3. Assert
		assertEquals("Cylinder radius should be 10.", expected, (int)cylinder.getRadius());
	}
	
}
