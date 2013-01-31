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
		othe_1.getOt()[3][5].setEtat('B');
		othe_1.getOt()[3][5].setPx(3);
		othe_1.getOt()[3][5].setPy(5);
		othe_1.getOt()[3][4].setEtat('B');
		System.out.println();
		oth_test.ajouterPion(new Pion('B',3,5));
	
		
		
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue("Le test s'est bien passé ",oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
			}
		}
		
		
	}

	@Test
	public void testOtelo() {
		fail("Not yet implemented");
	}

	@Test
	public void testReg_hor() {
		/*Test pour vérification de la regle de transformation horizontale coté gauche*/
		Othello othe_1 = new Othello();
		othe_1.getOt()[4][5]=new Pion('N', 4, 5);
		othe_1.reg_hor(new Pion('N', 4, 5));
		
		oth_test.getOt()[4][5].setEtat('N');
		oth_test.getOt()[4][5].setPx(4);
		oth_test.getOt()[4][5].setPy(5);
		oth_test.getOt()[4][4].setEtat('N');
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
				
			}
			}
		
		/*Test pour vérification de la regle de transformation horizontale coté droit*/
		
		othe_1 = new Othello();
		oth_test = new Othello();
		othe_1.getOt()[3][2]=new Pion('N', 3, 2);
		othe_1.reg_hor(new Pion('N', 3, 2));
			
		oth_test.getOt()[3][2].setEtat('N');
		oth_test.getOt()[3][2].setPx(3);
		oth_test.getOt()[3][2].setPy(2);
		oth_test.getOt()[3][3].setEtat('N');
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());

			}
			}
		
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
