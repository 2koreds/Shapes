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
		Dialog dialog = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		Cuboid cuboid = shapeFactory.makeCuboid(dialog);
		Cylinder cylinder = shapeFactory.makeCylinder(dialog);
		Sphere sphere = shapeFactory.makeSphere(dialog);
		
		System.out.println("Welcome to the Shapes Renderer.");
		
		System.out.println("\nPlease enter the Length you will use for your shapes: ");
		float shapeLength= 0;

		// Validation so that the user enters in a usable value;
		// If invalid, prompts the user to enter it again until it is validated.
		// If valid, sets the value for the object and exits the loop.
		while (shapeLength == 0) {
			shapeLength = keyboard.nextFloat();
			
			System.out.println("You entered: \"" + shapeLength + "\" for the shapes length.\n");
			
			if (shapeLength <= 0) {
				System.out.println("\"" + shapeLength + "\" is invalid input.");
				System.out.println("Please enter a positive number for the shapes length: ");
				shapeLength = 0;
			} else if (shapeLength > 0) {
				cuboid.setLength(shapeLength);
			}
		}
		
		System.out.println("Please enter the Width you will use for your shapes: ");
		float shapeWidth = 0;

		// Validation so that the user enters in a usable value;
		// If invalid, prompts the user to enter it again until it is validated.
		// If valid, sets the value for the object and exits the loop.
		while (shapeWidth == 0) {
			shapeWidth = keyboard.nextFloat();
			
			System.out.println("You entered: \"" + shapeWidth + "\" for the shapes width.\n");
			
			if (shapeWidth <= 0) {
				System.out.println("\"" + shapeWidth + "\" is invalid input.");
				System.out.println("Please enter a positive number for the shapes width: ");
				shapeWidth = 0;
			} else if (shapeWidth > 0) {
				cuboid.setWidth(shapeWidth);
			}
		}
		
		System.out.println("Please enter the Height you will use for your shapes: ");
		float shapeHeight = 0;

		// Validation so that the user enters in a usable value;
		// If invalid, prompts the user to enter it again until it is validated.
		// If valid, sets the value for the object and exits the loop.
		while (shapeHeight == 0) {
			shapeHeight = keyboard.nextFloat();
			
			System.out.println("You entered: \"" + shapeHeight + "\" for the shapes height.\n");
			
			if (shapeHeight <= 0) {
				System.out.println("\"" + shapeHeight + "\" is invalid input.");
				System.out.println("Please enter a positive number for the shapes height: ");
				shapeHeight = 0;
			} else if (shapeHeight > 0) {
				cuboid.setHeight(shapeHeight);
				cylinder.setHeight(shapeHeight);
			}
		}
		
		System.out.println("Please enter the Radius you will use for your shapes: ");
		float shapeRadius = 0;
		
		// Validation so that the user enters in a usable value;
		// If invalid, prompts the user to enter it again until it is validated.
		// If valid, sets the value for the object and exits the loop.
		while (shapeRadius == 0) {
			shapeRadius = keyboard.nextFloat();
			
			System.out.println("You entered: \"" + shapeRadius + "\" for the shapes radius.\n");
			
			if (shapeRadius <= 0) {
				System.out.println("\"" + shapeRadius + "\" is invalid input.");
				System.out.println("Please enter a positive number for the shapes radius: ");
				shapeRadius = 0;
			} else if (shapeRadius > 0) {
				cylinder.setRadius(shapeRadius);
				sphere.setRadius(shapeRadius);
			}
		}
		
		System.out.println("Please enter the Depth you will use for your shapes: ");
		float shapeDepth = 0;

		// Validation so that the user enters in a usable value;
		// If invalid, prompts the user to enter it again until it is validated.
		// If valid, sets the value for the object and exits the loop.
		while (shapeDepth == 0) {
			shapeDepth = keyboard.nextFloat();
			
			System.out.println("You entered: \"" + shapeDepth + "\" for the shapes depth.\n");
			
			if (shapeDepth <= 0) {
				System.out.println("\"" + shapeDepth + "\" is invalid input.");
				System.out.println("Please enter a positive number for the shapes depth: ");
				shapeDepth = 0;
			} else if (shapeDepth > 0) {
				cuboid.setDepth(shapeDepth);
			}
		}
		
		System.out.println("\nNow displaying final values for shapes attributes.");
		System.out.println("\nShapes Length: " + shapeLength + ".");
		System.out.println("Shapes Width: " + shapeWidth + ".");
		System.out.println("Shapes Height: " + shapeHeight + ".");
		System.out.println("Shapes Radius: " + shapeRadius + ".");
		System.out.println("Shapes Depth: " + shapeDepth + ".");
	
		System.out.println("\nNow Calculating Surface Area and Volume for each Shape.");
		// Simply calling the surfaceArea() and volume() override methods of each Object
		// This step simply helps with validation through the values given from console output
		float cuboidSurfaceArea = cuboid.getSurfaceArea();
		float cuboidVolume = cuboid.getVolume();
		float cylinderSurfaceArea = cylinder.getSurfaceArea();
		float cylinderVolume = cylinder.getVolume();
		float sphereSurfaceArea = sphere.getSurfaceArea();
		float sphereVolume = sphere.getVolume();
		
		System.out.println("\nCuboid Surface Area: " + cuboidSurfaceArea);
		System.out.println("Cuboid Volume: " + cuboidVolume);
		System.out.println("Cylinder Surface Area: " + cylinderSurfaceArea);
		System.out.println("Cylinder Volume: " + cylinderVolume);	
		System.out.println("Sphere Surface Area: " + sphereSurfaceArea);
		System.out.println("Sphere Volume: " + sphereVolume);	
		
		System.out.println("\nRendering your Shape(s)...");
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}
	
}
