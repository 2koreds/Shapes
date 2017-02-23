/**
 * 
 */
package org.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.tests.substitutes.MessageBoxSub;
import org.junit.Test;

/**
 * @author Matthew
 *
 */
public class CuboidUnitTest {

	@Test
	public void cuboidRender() {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(messageBoxSub);
		
		// 2. Act/Assert
		cuboid.render();
	}
	
	
	
	// Verifies that that cuboid getWidth() is obtainable
	@Test
	public void cuboidGetWidth() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(messageBoxSub);
		int expected = 20;
		// 2. Act
		cuboid.setWidth(20);
		// 3. Assert
		assertEquals("Cuboid width should be 20.", expected, (int)cuboid.getWidth());
	}
		
	// Verifies that that cuboid getHeight() is obtainable
	@Test
	public void cuboidGetHeight() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(messageBoxSub);
		int expected = 15;
		// 2. Act
		cuboid.setHeight(15);
		// 3. Assert
		assertEquals("Cuboid height should be 15.", expected, (int)cuboid.getHeight());
		}
			
	// Verifies that that cuboid getLength() is obtainable
	@Test
	public void cuboidGetLength() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(messageBoxSub);
		int expected = 15;
		// 2. Act
		cuboid.setLength(15);
		// 3. Assert
		assertEquals("Cuboid length should be 15.", expected, (int)cuboid.getLength());
	}
		
	// Verifies that that cuboid getDepth() is obtainable
	@Test
	public void cuboidGetDepth() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Cuboid cuboid = new Cuboid(messageBoxSub);
		int expected = 10;
		// 2. Act
		cuboid.setDepth(10);
		// 3. Assert
		assertEquals("Cuboid width should be 10.", expected, (int)cuboid.getDepth());
	}	
	
}
