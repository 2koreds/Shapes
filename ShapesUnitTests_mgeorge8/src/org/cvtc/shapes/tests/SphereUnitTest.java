package org.cvtc.shapes.tests;

import static org.junit.Assert.assertEquals;

import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.tests.substitutes.MessageBoxSub;
import org.junit.Test;

public class SphereUnitTest {

	@Test
	public void sphereRender() {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Sphere sphere = new Sphere(messageBoxSub);
		
		// 2. Act/Assert
		sphere.render();
	}
	
	// Verifies that that sphere getRadius() is obtainable
	@Test
	public void sphereGetRadius() throws IllegalArgumentException {
		// 1. Arrange
		MessageBoxSub messageBoxSub = new MessageBoxSub();
		Sphere sphere = new Sphere(messageBoxSub);
		int expected = 10;
		// 2. Act
		sphere.setRadius(10);
		// 3. Assert
		assertEquals("Sphere radius should be 10.", expected, (int)sphere.getRadius());
	}
	
}
