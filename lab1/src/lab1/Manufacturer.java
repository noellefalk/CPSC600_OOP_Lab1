/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package lab1;

public interface Manufacturer {
	public void registerSupplier(Supplier s);
	public void removeSupplier(Supplier s);
	public void notifySuppliers();
}
