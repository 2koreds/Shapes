/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew
 *
 */

//Represents a 3D cuboid shape.
public class Cuboid extends Shape {

	/*
	 * Variable declaration
	 */
	
	// The width of this Cuboid instance.
	private float width = 0.0f;
	
	// The height of this Cuboid instance.
	private float height = 0.0f;
	
	// The depth of this Cuboid instance.
	private float depth = 0.0f;
	
	/*
	 * Cuboid Class Constructor(s)
	 */
	
	// Initializes a new instance of a Cuboid using passed in parameters
		public Cuboid(float width, float height, float depth) {
			
			// Checking to see if width is less then or equal to zero.
			// If it is, a negative value has been used and is reassigned to a default value of 1
			if (width <= 0) {
				width = 1;
				System.out.println("Cannot use negative or non-existent values for width; Width set to 1.");
			}
			
			// Checking to see if height is less then or equal to zero.
			// If it is, a negative value has been used and is reassigned to a default value of 1
			if (height <= 0) {
				height = 1;
				System.out.println("Cannot use negative or non-existent values for height; height set to 1.");
			}
			
			// Checking to see if depth is less then or equal to zero.
			// If it is, a negative value has been used and is reassigned to a default value of 1
			if (depth <= 0) {
				depth = 1;
				System.out.println("Cannot use negative or non-existent values for depth; Depth set to 1.");
			}
					
			// Set the dimensions of this Cuboid instance using the setter methods.
			setWidth(width);
			setHeight(height);
			setDepth(depth);

		}
	
	/*
	 * Class methods including superclass methods
	 * 
	 * Overridden methods are from the abstract superclass, Shape, and the logic
	 * for how that method is to be used is defined here per each class that uses it.
	 */
	
		
	/*
	 * When we have these override methods for the superclass it confused me as to why your code example
	 * had us use getSurfaceArea() instead of using the override and storing that in the main() method.
	 * So if the way I "tackle" this is incorrect, please let me know as I encountered quite a bit of confusion here!
	 * 		 * On top of that I cannot find the equation you used for Surface Area which is confusing me further, and making me		 * feel entirely lost.		 */
	// A method call for determining the surface area of the initialized Cuboid.	
	@Override
	float surfaceArea() {
		
		// TODO Put real code here!
		
		// Whats the real code???
				
		// Notice we use accessors instead of fields.
		// A comment describing math equations
		// Sometimes these are hard to read
				
		// I cannot find the equation to get surface area using these values; but the below
		// return statement returns the surface area of a cuboid
		return getWidth() * getDepth() * getHeight() * (float)Math.PI;
				
	}

	// A method call for determining the volume of the initialized Cuboid.
	@Override
	float volume() {
		// TODO Put real code here!
		
		// Volume is found by multiplying the surface area by the Depth
		return surfaceArea() * getDepth();
	}

	// A method call to determine and output the initialized Cuboids dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	void render() {
	
		// JOptionPane to show a popup box displaying data about the object
		JOptionPane.showMessageDialog(null, ("Cuboid width: " + getWidth() + ".\nCuboid Depth: " + getDepth() + ".\nCuboid Height: " + getHeight() + ".\nCuboid Surface Area: " + surfaceArea() + ".\nCuboid Volume: " + volume() + "."));
		return;
		
	}
	
	/*
	 * Starting below here are Getters and Setters
	 */
	
	// Gets the width of this Cuboid instance.
	private float getWidth() {
		return width;
	}
	
	// Sets the width of this Cuboid instance.
	private void setWidth(float width) {
		this.width = width;
	}
	
	// Gets the height of this Cuboid instance.
	private float getHeight() {
		return height;
	}
	
	// Sets the height of this Cuboid instance.
	private void setHeight(float height) {
		this.height = height;
	}
	
	//Gets the depth of this Cuboid instance.
	private float getDepth() {
		return depth;
	}

	// Sets the depth of this Cuboid instance.
	private void setDepth(float depth) {
		this.depth = depth;
	}

}

