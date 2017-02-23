/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Matthew
 *
 */
// Represents a Cylinder shape
public class Cylinder extends Shape implements Renderer {
	
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

	// Initializes a new instance of a Cylinder
	public Cylinder(Dialog dialog) {
		super(dialog);
	}
	
	/*
	 * Cylinder Class Methods
	 */
	
	// A method call to get and output the initialized Cylinders dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	public void render() {
		// getDialog().show method to show a popup box displaying data about the object
		getDialog().show("Cylinder Radius: " + getRadius() + ".\nCylinder Height:" + getHeight() + ".\nCylinder Surface Area: " + getSurfaceArea() + ".\nCylinder Volume: " + getVolume() + ".", "Cylinder Render");
	}
	
	/*
	 * Starting below here are Getters and Setters methods
	 */
	
	// A method call for getting the surface area of the initialized Cylinder.	
	@Override
	public float getSurfaceArea() {
		// TODO Put real code here!
				
		// Equation for the Surface Area of a Cylinder:
		// 2 PI * radius squared + 2 PI * radius * height
		return ((2 * ((float)Math.PI) * (getRadius() * getRadius())) + (2 * ((float)Math.PI) * (getRadius()) * (getHeight())) );
	}

	// A method call for getting the volume of the initialized Cylinder.
	@Override
	public float getVolume() {
		// TODO Put real code here!
		
		// Volume is found by the following equation:
		// V = PI * radius squared * height
		return (((float)Math.PI) * (getRadius() * getRadius()) * (getHeight()));
	}

	// Gets the height of this Cylinder instance
	public float getHeight() {
		return height;
	}

	// Sets the height of this Cylinder instance
	public void setHeight(float height) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 15.
		if (height <= 0) {
			height = 15;
		}
		
		this.height = height;
	}

	// Gets the radius for this Cylinder instance
	public float getRadius() {
		return radius;
	}

	// Sets the radius for this Cylinder instance
	public void setRadius(float radius) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 10.
		if (radius <= 0) {
			radius = 10;
		}
		
		this.radius = radius;
	}
	
}
