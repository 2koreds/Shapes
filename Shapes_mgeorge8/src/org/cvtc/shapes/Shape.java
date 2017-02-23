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
	 * Variables for our Abstract class
	 */
	
	
	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	
	/*
	 * Methods for our Abstract class
	 */
	
	// A method for finding the surface area of a shape
	public abstract float getSurfaceArea();
	
	// A method for finding the volume of a shape
	public abstract float getVolume();
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
	
	
}
