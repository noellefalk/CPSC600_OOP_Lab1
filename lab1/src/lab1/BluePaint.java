/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class BluePaint extends FrameDecorator {
	
	public BluePaint(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", blue paint";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 29.99;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 1);
	}
}
