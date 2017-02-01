/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew
 *
 */
// Represents a Cylinder shape
public class Cylinder extends Shape {
	
	/*
	 * Variable declaration
	 */
	
	// The height of this Cylinder instance.
	private float height = 0.0f;
	
	// The radius of this Cylinder instance.
	private float radius = 0.0f;
	
	/*
	 * Cylinder Class Constructor(s)
	 */
	
	// Initializing a new instance of our Cylinder using passed in parameters
	public Cylinder(float radius, float height) {
		
		// Checking to see if radius is less then or equal to zero.
		// If it is, a negative value has been used and is reassigned to a default value of 1
		if (radius <= 0) {
			radius = 1;
			System.out.println("Cannot use negative or non-existent values for radius; radius set to 1.");
		}
		
		// Checking to see if height is less then or equal to zero.
		// If it is, a negative value has been used and is reassigned to a default value of 1
		if (height <= 0) {
			height = 1;
			System.out.println("Cannot use negative or non-existent values for height; height set to 1.");
		}
		
		// Set the dimensions of this Cylinder instance using the setter methods.
					setHeight(height);
					setRadius(radius);
	}
	
	/*
	 * Class methods including superclass methods
	 * 
	 * Overridden methods are from the abstract superclass, Shape, and the logic
	 * for how that method is to be used is defined here per each class that uses it.
	 */
	
	// A method call for determining the surface area of the initialized Cylinder.	
	@Override
	float surfaceArea() {
		
		// TODO Put real code here!
		
		// Whats the real code???
				
		// Equation for the Surface Area of a Cylinder:
		// 2 PI * radius squared + 2 PI * radius * height
		return ((2 * ((float)Math.PI) * (getRadius() * getRadius())) + (2 * ((float)Math.PI) * (getRadius()) * (getHeight())) );
		
	}

	// A method call for determining the volume of the initialized Cylinder.
	@Override
	float volume() {
		
		// TODO Put real code here!
		
		// Volume is found by the following equation:
		// V = PI * radius squared * height
		return (((float)Math.PI) * (getRadius() * getRadius()) * (getHeight()));
		
	}

	// A method call to determine and output the initialized Cylinders dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	void render() {
		
		// JOptionPane to show a popup box displaying data about the object
				JOptionPane.showMessageDialog(null, ("Cylinder Radius: " + getRadius() + ".\nCylinder Height: " + getHeight() + ".\nCylinder Surface Area: " + surfaceArea() + ".\nCylinder Volume: " + volume() + "."));
				return;
				
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}
