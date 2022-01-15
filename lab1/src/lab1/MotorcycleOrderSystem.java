/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public class MotorcycleOrderSystem {

	public static void main(String[] args) {
		SpeedyMotors speedyMotors = new SpeedyMotors(); 
		
		PaintSupplier paintSupplier = new PaintSupplier(speedyMotors);
		EngineSupplier engineSupplier = new EngineSupplier(speedyMotors);
		TireSupplier tireSupplier = new TireSupplier(speedyMotors);
		
		speedyMotors.placeOrder("blue", "500cc", 15);
		
		MotorcycleFrame cruiser = new CruiserFrame();
		
		cruiser = new BluePaint(cruiser);
		cruiser = new Engine500cc(cruiser);
		cruiser = new FifteenTire(cruiser);
		
		System.out.println("Motorcycle order: " + cruiser.getDescription());
		System.out.println("The final cost is $" + cruiser.cost() + " and will be delivered in " + cruiser.leadtime() + " weeks." );	
	}
}
