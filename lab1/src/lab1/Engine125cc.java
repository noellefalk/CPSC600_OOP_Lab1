/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class Engine125cc extends FrameDecorator {

	public Engine125cc(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", 125cc engine";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 250.00;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 7);
	}
}