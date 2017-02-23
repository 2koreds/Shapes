/**
 * 
 */
package org.cvtc.shapes;


/**
 * @author Matthew
 *
 */

//Represents a 3D cuboid shape.
public class Cuboid extends Shape implements Renderer {
	
	/*
	 * Variable declaration
	 */
	
	// The width of this Cuboid instance.
	private float width = 0.0f;
	
	// The height of this Cuboid instance.
	private float height = 0.0f;
	
	// The length of this Cuboid instance.
	private float length = 0.0f;
	
	// The depth of this Cuboid instance.
	private float depth = 0.0f;
	
	/*
	 * Cuboid Class Constructor(s)
	 */
	
	// Initializes a new instance of a Cuboid
	public Cuboid(Dialog dialog) {
		super(dialog);
	}
	
	/*
	 * Cuboid Class Methods
	 */
	
	// A method call to get and output the initialized Cuboids dimensions, surface area,
	// and volume. Output will be in a simple message box.
	@Override
	public void render() {
		// getDialog().show method to show a popup box displaying data about the object
		getDialog().show("Cuboid width: " + getWidth() + ".\nCuboid Depth: " + getDepth() + ".\nCuboid Height: " + getHeight() + ".\nCuboid Length: " + getLength() + ".\nCuboid Surface Area: " + getSurfaceArea() + ".\nCuboid Volume: " + getVolume() + ".", "Cuboid Render");
	}
		
	/*
	 * Starting below here are Getters and Setters methods
	 */
		
	// A method call for getting the surface area of the initialized Cuboid.	
	@Override
	
	public float getSurfaceArea() {
		// TODO Put real code here!
				
		// Notice we use accessors instead of fields.
		// A comment describing math equations
		// Sometimes these are hard to read
				
		// Formula for Surface Area of a Cuboid:
		// 2 * (length * width + width * height + height * length)
		return (2 * ((getLength() * getWidth()) + (getWidth() * getHeight()) + (getHeight() * getLength())));
	}

	// A method call for getting the volume of the initialized Cuboid.
	@Override
	public float getVolume() {
		// TODO Put real code here!
		
		// Formula for Volume of a Cuboid:
		// Height * Width * Depth
		return (getHeight() * getWidth() * getDepth());
	}
	
	// Gets the width of this Cuboid instance.
	public float getWidth() {
		return width;
	}
	
	// Sets the width of this Cuboid instance.
	public void setWidth(float width) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 20.
		if (width <= 0) {
			width = 20;
		}
		
		this.width = width;
	}
	
	// Gets the height of this Cuboid instance.
	public float getHeight() {
		return height;
	}
	
	// Sets the height of this Cuboid instance.
	public void setHeight(float height) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 15.
		if (height <= 0) {
			height = 15;
		}
		
		this.height = height;
	}
	
	// Gets the length of this Cuboid instance.
	public float getLength() {
		return length;
	}
		
	// Sets the length of this Cuboid instance.
	public void setLength(float length) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 15.
		if (length <= 0) {
			length = 15;
		}
		
		this.length = length;
	}
	
	//Gets the depth of this Cuboid instance.
	public float getDepth() {
		return depth;
	}

	// Sets the depth of this Cuboid instance.
	public void setDepth(float depth) {
		// Additional error handling; If a value was somehow passed
		// incorrectly then we will assign it a default value of 10.
		if (depth <= 0) {
			depth = 10;
		}
		
		this.depth = depth;
	}
	
}

