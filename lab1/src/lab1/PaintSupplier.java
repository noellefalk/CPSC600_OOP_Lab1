/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class PaintSupplier implements Supplier {
	private String paintColor;
	SpeedyMotors speedyMotors;
	
	public PaintSupplier(SpeedyMotors speedyMotors) {
		this.speedyMotors = speedyMotors;
		speedyMotors.registerSupplier(this);
	}
	
	public void update(String paintColor, String engineType, int tireSize) {
		this.paintColor = paintColor;
		System.out.println("The order is confirmed for " + this.paintColor + " paint.");
	}
}
