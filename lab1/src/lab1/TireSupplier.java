/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class TireSupplier implements Supplier {
	private int tireSize;
	SpeedyMotors speedyMotors;
	
	public TireSupplier(SpeedyMotors speedyMotors) {
		this.speedyMotors = speedyMotors;
		speedyMotors.registerSupplier(this);
	}
	
	public void update(String paintColor, String engineType, int tireSize) {
		this.tireSize = tireSize;
		System.out.println("The order is confirmed for " + this.tireSize + " inch tires.");
	}
}
