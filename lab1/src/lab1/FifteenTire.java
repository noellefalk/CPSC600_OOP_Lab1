/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class FifteenTire extends FrameDecorator{
	
	public FifteenTire(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", 15\" tires";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 120.00;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 2);
	}
}