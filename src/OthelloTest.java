import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class OthelloTest {
protected Othello oth_test;
	@Before
	public void setUp() throws Exception {
		oth_test = new Othello();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAjouterPion() {
		Othello othe_1 = new Othello();
		othe_1.afficher();
		othe_1.getOt()[3][5].setEtat('B');
		othe_1.getOt()[3][5].setPx(3);
		othe_1.getOt()[3][5].setPy(5);
		othe_1.getOt()[3][4].setEtat('B');
		System.out.println();
		oth_test.afficher();
		oth_test.ajouterPion(new Pion('B',3,5));
	
		
		
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
				//assertEquals(oth_test.getOt()[3][5], othe_1.getOt()[3][5]);
			}
		}
		
		
	}

	@Test
	public void testOtelo() {
		fail("Not yet implemented");
	}

	/**
	 * Test du MAJ du plateau.
	 */
	@Test
	public void testAfficher() {
//		fail("Not yet implemented");
//		System.out.println("Test de mise a jour du plateau ");
//		Othello instance = new Othello();
//		instance.afficher();
	}

	@Test
	public void testReg_hor() {
		fail("Not yet implemented");
	}

	@Test
	public void testReg_ver() {
		fail("Not yet implemented");
	}

	@Test
	public void testReg_diag() {
		fail("Not yet implemented");
	}

}
