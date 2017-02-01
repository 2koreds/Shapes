/**
 * 
 */
package org.cvtc.shapes;

import java.util.Scanner;

/**
 * @author Matthew
 *
 */
// Class to test our shapes program
public class ShapesTest {
	
	// Creating a scanner so that users can enter in their own shape sizes
	public static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	
	// Main method where all of our code logic will execute
	public static void main(String[] args) {
		
		// Variable / Object initialization
		Shape cuboid = new Cuboid(20, 15, 10);
		Shape cylinder = new Cylinder(10, 15);
		Shape sphere = new Sphere(10);
		
		// The following variables are commented out
		// because they are unnecessary at the given stage
		/*
			// Variables for Cuboid SA and Volume
			float cuboidSurfaceArea;
			float cuboidVolume;
			
			// Variables for Cylinder SA and Volume
			float cylinderSurfaceArea;
			float cylinderVolume;
			
			// Variables for Sphere SA and Volume
			float sphereSurfaceArea;
			float sphereVolume;
		*/
		System.out.println("For times sake, we will choose the size's of your shapes.");
		System.out.println("Default Value for all Radius and Depth: 10");
		System.out.println("Default Value for all Height: 15");
		System.out.println("Default Value for all width: 20");
		
		System.out.println("Now Calculating Surface Area and Volume for each Shape.");
		
		// Simply calling the surfaceArea() and volume() override methods of each Object
		// This is an unnecessary step but shows the ability to use getters and setters (or call class methods in this case)
		/*
			cuboidSurfaceArea = cuboid.surfaceArea();
			cuboidVolume = cuboid.volume();
			
			cylinderSurfaceArea = cylinder.surfaceArea();
			cylinderVolume = cylinder.volume();
			
			sphereSurfaceArea = sphere.surfaceArea();
			sphereVolume = sphere.volume();
		*/
		
		System.out.println("Rendering your Shape(s)...");
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
		
	}

}
