/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class RedPaint extends FrameDecorator {
	
	public RedPaint(MotorcycleFrame motorcycleFrame) {
		this.motorcycleFrame = motorcycleFrame; 
	}

	public String getDescription() {
		return motorcycleFrame.getDescription() + ", red paint";
	}
	
	public double cost() {
		return motorcycleFrame.cost() + 49.99;
	}
	
	public int leadtime() {
		return Math.max(motorcycleFrame.leadtime(), 1);
	}
}
