/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public abstract class MotorcycleFrame {
	String description = "Unknown Motorcycle Frame";
	
	public String getDescription() { 
		return description;
	}
	
	public abstract double cost();
	
	//tracks the deliverable time of the product in weeks
	public abstract int leadtime();

}
