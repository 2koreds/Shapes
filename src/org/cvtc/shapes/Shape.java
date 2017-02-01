/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Matthew
 *
 */
public abstract class Shape {
	
	/*
	 * Methods for our Abstract class
	 */
	
	// A method for finding the surface area of a shape
	abstract float surfaceArea();
	
	// A method for finding the volume of a shape
	abstract float volume();
	
	// An abstract method for rendering a text box with a shapes dimensions,
	// surface area, and volume.
	abstract void render();
	
}
