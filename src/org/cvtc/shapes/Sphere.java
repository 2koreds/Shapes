/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew
 *
 */
// Represents a Sphere shape
public class Sphere extends Shape {

	/*
	 * Variable declaration
	 */
	
	// The radius of this Sphere instance.
	private float radius = 0.0f;
	
	/*
	 * Sphere Class Constructor(s)
	 */
	
	// Initializing a new instance of our Sphere using passed in parameters
	public Sphere(float radius) {
		
		// Checking to see if radius is less then or equal to zero.
		// If it is, a negative value has been used and is reassigned to a default value of 1
		if (radius <= 0) {
			radius = 1;
			System.out.println("Cannot use negative or non-existent values for radius; radius set to 1.");
		}
		
		// Set the dimensions of this Sphere instance using the setter methods.
					setRadius(radius);
	}
	
	/*
	 * Class methods including superclass methods
	 * 
	 * Overridden methods are from the abstract superclass, Shape, and the logic
	 * for how that method is to be used is defined here per each class that uses it.
	 */
	
	// A method call for determining the surface area of the initialized Sphere.	
	@Override
	float surfaceArea() {
		
		// TODO Put real code here!
		
		// Whats the real code???
				
		// Equation for the Surface Area of a Sphere:
		// 4 * PI * radius squared
		return ((4 * (float)Math.PI) * (getRadius() * getRadius()));
				
	}

	// A method call for determining the volume of the initialized Sphere.
	@Override
	float volume() {
		
		// TODO Put real code here!
		
		// Volume is found by the following equation:
		// V = 4/3(PI * radius cubed)
		return ((4 / 3) * ((float)Math.PI) * (getRadius() * getRadius() * getRadius()));
				
	}

	// A method call to determine and output the initialized Spheres dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	void render() {
		
		// JOptionPane to show a popup box displaying data about the object
		JOptionPane.showMessageDialog(null, ("Sphere Radius: " + getRadius() + ".\nSphere Surface Area: " + surfaceArea() + ".\nSphere Volume: " + volume() + "."));
		return;
		
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
