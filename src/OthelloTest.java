import static org.junit.Assert.*;

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
		othe_1.getOt()[3][5].setEtat('B');
		othe_1.getOt()[3][5].setPx(3);
		othe_1.getOt()[3][5].setPy(5);
		
		oth_test.ajouterPion(new Pion('B',3,5));
		oth_test.afficher();
		System.out.println();
		othe_1.afficher();
		
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				
				assertEquals(oth_test.getOt()[3][5], othe_1.getOt()[3][5]);
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
