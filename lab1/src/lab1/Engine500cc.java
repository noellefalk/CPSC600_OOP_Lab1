/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class Engine500cc extends FrameDecorator {

	public Engine500cc(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", 500cc engine";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 350.00;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 8);
	}
}