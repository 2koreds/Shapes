/**
 * 
 */
package org.cvtc.shapes.tests;


import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Sphere;
import org.cvtc.shapes.tests.substitutes.ShapeFactorySub;
import org.junit.Test;
/**
 * @author Matthew
 *
 */
public class ShapeFactoryUnitTests {

	@Test
	public void cuboidRenderShapeFactory() {
		// 1. Arrange
		ShapeFactorySub shapeFactorySub = new ShapeFactorySub();
		Cuboid cuboid = ShapeFactorySub.makeCuboid(shapeFactorySub);
		
		// 2. Act/Assert
		cuboid.render();
	}
	
	@Test
	public void cylinderRenderShapeFactory() {
		// 1. Arrange
		ShapeFactorySub shapeFactorySub = new ShapeFactorySub();
		Cylinder cylinder = ShapeFactorySub.makeCylinder(shapeFactorySub);
		
		// 2. Act/Assert
		cylinder.render();
	}	
	
	@Test
	public void sphereRenderShapeFactory() {
		// 1. Arrange
		ShapeFactorySub shapeFactorySub = new ShapeFactorySub();
		Sphere sphere = ShapeFactorySub.makeSphere(shapeFactorySub);
		
		// 2. Act/Assert
		sphere.render();
	}	
	
}
