/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

import java.util.ArrayList;

public class SpeedyMotors implements Manufacturer {
	private ArrayList<Supplier> suppliers;
	private String paintColor; 
	private String engineType;
	private int tireSize; 
	
	public SpeedyMotors() {
		suppliers = new ArrayList<Supplier>();
	}
	
	public void registerSupplier(Supplier s) {
		suppliers.add(s);
	}
	
	public void removeSupplier(Supplier s) {
		suppliers.remove(s);
	}
	
	public void notifySuppliers() {
		for (Supplier supplier : suppliers) {
			supplier.update(paintColor, engineType, tireSize);
		}
	}	
	
	public void orderPlaced() {
		notifySuppliers();
	}
	
	public void placeOrder(String paintColor, String engineType, int tireSize) {
		this.paintColor = paintColor;
		this.engineType = engineType;
		this.tireSize = tireSize;
		orderPlaced();
	}
}
