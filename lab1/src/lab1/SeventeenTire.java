/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class SeventeenTire extends FrameDecorator {

	public SeventeenTire(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", 17\" tires";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 150.00;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 2);
	}
}