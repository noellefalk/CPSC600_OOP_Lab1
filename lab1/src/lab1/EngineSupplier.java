/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class EngineSupplier implements Supplier {
	private String engineType;
	private SpeedyMotors speedyMotors;
	
	public EngineSupplier(SpeedyMotors speedyMotors) {
		this.speedyMotors = speedyMotors;
		speedyMotors.registerSupplier(this);
	}
	
	public void update(String paintColor, String engineType, int tireSize) {
		this.engineType = engineType;
		System.out.println("The order is confirmed for " + this.engineType + " engine.");
	}	
}
