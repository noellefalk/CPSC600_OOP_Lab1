/* Object Oriented Development
 * Spring 2022
 * Name: Noelle Falk
 * Lab 1 
 */

package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab1.BluePaint;
import lab1.CruiserFrame;
import lab1.Engine125cc;
import lab1.Engine500cc;
import lab1.FifteenTire;
import lab1.MotorcycleFrame;
import lab1.RedPaint;
import lab1.SeventeenTire;
import lab1.SportFrame;

class TestMotorcycleOrderSystem {

	@Test
	void testCost1() {
		MotorcycleFrame cruiser = new CruiserFrame();
		
		cruiser = new BluePaint(cruiser);
		cruiser = new Engine500cc(cruiser);
		cruiser = new FifteenTire(cruiser);
		
		assertEquals(cruiser.cost(), 1249.99);
	}
	
	@Test
	void testCost2() {
		MotorcycleFrame sport = new SportFrame();
		
		sport = new RedPaint(sport);
		sport = new Engine125cc(sport);
		sport = new SeventeenTire(sport);
		
		assertEquals(sport.cost(), 1649.99);
	}
	
	@Test
	void testLeadtime1() {
		MotorcycleFrame cruiser = new CruiserFrame();
		
		cruiser = new BluePaint(cruiser);
		cruiser = new Engine500cc(cruiser);
		cruiser = new FifteenTire(cruiser);
		
		assertEquals(cruiser.leadtime(), 8);
	}
	
	@Test
	void testLeadtime2() {
		MotorcycleFrame sport = new SportFrame();
		
		sport = new RedPaint(sport);
		sport = new Engine125cc(sport);
		sport = new SeventeenTire(sport);
		
		assertEquals(sport.leadtime(), 7);
	}
	
	@Test
	void testdescription() {
		MotorcycleFrame sport = new SportFrame();
		
		sport = new RedPaint(sport);
		sport = new Engine125cc(sport);
		sport = new SeventeenTire(sport);
		
		assertEquals(sport.getDescription(), "Sport frame, red paint, 125cc engine, 17\" tires");	
	}
}
