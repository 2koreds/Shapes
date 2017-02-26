/**
 * 
 */
package org.cvtc.shapes.tests.substitutes;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.Sphere;

/**
 * @author Matthew
 *
 */
public class ShapeFactorySub implements Dialog {

	public ShapeFactorySub() {
	}
	
	@Override
	public int show(String message, String title) {
		return 0x00;
	}
	
	public static Cuboid makeCuboid(ShapeFactorySub shapeFactorySub) {
		return new Cuboid(shapeFactorySub);
	}
	
	public static Cylinder makeCylinder(ShapeFactorySub shapeFactorySub) {
		return new Cylinder(shapeFactorySub);
	}
	
	public static Sphere makeSphere(ShapeFactorySub shapeFactorySub) {
		return new Sphere(shapeFactorySub);
	}
	
}
