/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Matthew
 *
 */
// Represents a Sphere shape
public class Sphere extends Shape implements Renderer {
	
	/*
	 * Variable declaration
	 */
	
	// The radius of this Sphere instance.
	private float radius = 0.0f;
	
	/*
	 * Sphere Class Constructor(s)
	 */
	
	// Initializes a new instance of a Sphere
	public Sphere(Dialog dialog) {
		super(dialog);
	}
	
	/*
	 * Sphere Class Methods
	 */
	
	// A method call to get and output the initialized Spheres dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	public void render() {
		// getDialog().show method to show a popup box displaying data about the object
		getDialog().show("Sphere Radius: " + getRadius() + ".\nSphere Surface Area: " + getSurfaceArea() + ".\nSphere Volume: " + getVolume() + ".", "Sphere Render");
	}
	
	/*
	 * Starting below here are Getters and Setters methods
	 */
	
	// A method call for getting the surface area of the initialized Sphere.	
	@Override
	public float getSurfaceArea() {
		// TODO Put real code here!
		
		// Equation for the Surface Area of a Sphere:
		// 4 * PI * radius squared
		return ((4 * (float)Math.PI) * (getRadius() * getRadius()));		
	}

	// A method call for getting the volume of the initialized Sphere.
	@Override
	public float getVolume() {
		// TODO Put real code here!
		
		// Volume is found by the following equation:
		// V = 4/3(PI * radius cubed)
		return ((4 / 3) * ((float)Math.PI) * (getRadius() * getRadius() * getRadius()));		
	}

	// Gets the radius for this Sphere instance
	public float getRadius() {
		return radius;
	}

	// Sets the radius for this Sphere instance
	public void setRadius(float radius) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 10.
		if (radius <= 0) {
			radius = 10;
		}
		
		this.radius = radius;
	}
	
}
