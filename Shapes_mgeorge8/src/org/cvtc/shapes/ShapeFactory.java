/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author Matthew
 *
 */
public class ShapeFactory {

	private Dialog dialog;
	
	// Due to how I allow users to set their shape attributes, hopefully it will be fine if I
	// Pass dialog for the new shapes instead of attributes for the constructors as the UML Diagram shows.
	
	
	public ShapeFactory(Dialog dialog) {
	}
	
	public Cuboid makeCuboid(Dialog dialog) {
		return new Cuboid(dialog);
	}
	
	public Cylinder makeCylinder(Dialog dialog) {
		return new Cylinder(dialog);
	}
	
	public Sphere makeSphere(Dialog dialog) {
		return new Sphere(dialog);
	}
	
	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

}
