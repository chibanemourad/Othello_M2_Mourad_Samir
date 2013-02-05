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
		System.out.println("@Before: set up ");
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
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
			}
		}
		
		
	}

	@Test
	public void testOthello() {
		
		oth_test = new Othello();
		assertNotNull(oth_test);
		assertEquals(oth_test.getOt()[0][0].getEtat(), '*');
		assertFalse(oth_test.getOt()[0][0].getEtat()!='*');
		assertFalse(oth_test.getOt()[5][4].getEtat()!='*');
		System.out.println("Afficher le pion 0.0 ==========");
		oth_test.getOt()[0][0].afficher_Pion();
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
		/*Test pour vérification de la regle de transformation verticale coté bas*/
		Othello othe_1 = new Othello();
		othe_1.getOt()[2][3]=new Pion('N', 2, 3);
		System.out.println("============ Regle Verticale_basse Othello_1 ======== Avant Application de la regle : ");
		othe_1.afficher();
		othe_1.reg_ver(new Pion('N', 2, 3));
		System.out.println("============ Regle Verticale_basse Othello_1 ======== Après Application de la regle 'Verticale': ");
		othe_1.afficher();
		
		oth_test.getOt()[2][3].setEtat('N');
		oth_test.getOt()[2][3].setPx(2);
		oth_test.getOt()[2][3].setPy(3);
		oth_test.getOt()[3][3].setEtat('N');
		System.out.println("============ Regle Verticale_basse Othello_test ======== Après assigniation manuelle des pions : ");
		othe_1.afficher();
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
				
			}
			}
		
		/*Test pour vérification de la regle de transformation verticale coté Haut*/
		othe_1 = new Othello();
		oth_test = new Othello();
		othe_1.getOt()[5][4]=new Pion('N', 5, 4);
		othe_1.reg_ver(new Pion('N', 5, 4));
		
		oth_test.getOt()[5][4].setEtat('N');
		oth_test.getOt()[5][4].setPx(5);
		oth_test.getOt()[5][4].setPy(4);
		oth_test.getOt()[4][4].setEtat('N');
		for (int j=0; j<8;j++){
			for(int i=0;i<8;i++ ){
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
				
			}
			}
	}

	@Test
	public void testReg_diag() {
		/*Test de la regle de transformation diagonale */
		Othello othe_1 = new Othello();
		othe_1.getOt()[5][5]=new Pion('N',5,5);
		othe_1.getOt()[2][2]=new Pion('N',2,2);
		System.out.println("============ Regle Diagonale Othello_1 ======== Avant Application de la regle : ");
		othe_1.afficher();
		othe_1.reg_diag(new Pion('N',5,5));
		System.out.println("============ Regle Diagonale Othello_1 ======== Après application de la regle 'DIAGONALE' ");
		othe_1.afficher();
		//othe_1.reg_diag(new Pion('N',2,2));
		
		//oth_test = new Othello();
		oth_test.getOt()[5][5].setEtat('N');
		oth_test.getOt()[5][5].setPx(5);
		oth_test.getOt()[5][5].setPy(5);
		
		oth_test.getOt()[2][2].setEtat('N');
		oth_test.getOt()[2][2].setPx(2);
		oth_test.getOt()[2][2].setPy(2);
		
		oth_test.getOt()[4][4].setEtat('N');
		oth_test.getOt()[3][3].setEtat('N');
		System.out.println("============ Regle Diagonale Othello_test ======== Après assigniation manuelle des Pions ");
		oth_test.afficher();
		
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 8; i++) {
				Assert.assertTrue(oth_test.getOt()[i][j].getEtat()==othe_1.getOt()[i][j].getEtat());
				Assert.assertTrue(oth_test.getOt()[i][j].getPx()==othe_1.getOt()[i][j].getPx());
				Assert.assertTrue(oth_test.getOt()[i][j].getPy()==othe_1.getOt()[i][j].getPy());
			}
		}
		
		System.out.println("================================");
		
		
		
	}

}
