package mvc.model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasillaTest {

	@Test
	void testDentroRango() {
		Casilla cas1 = new Casilla();
		Casilla cas2 = new Casilla();
		
		cas1.posiciones(7,8);
		cas2.posiciones(1,3);
		
		//rangos validos
		assertTrue(cas1.dentroRango(9));
		assertTrue(cas1.dentroRango(10));
		assertTrue(cas1.dentroRango(12));
		assertTrue(cas2.dentroRango(8));
		assertTrue(cas2.dentroRango(10));
		assertTrue(cas2.dentroRango(12));	
		
		//rangos invalidos
		assertFalse(cas1.dentroRango(5));
		assertFalse(cas1.dentroRango(3));
		assertFalse(cas1.dentroRango(1));
		assertFalse(cas2.dentroRango(2));
		assertFalse(cas2.dentroRango(3));
		assertFalse(cas2.dentroRango(1));
		
		Casilla cas3 = new Casilla();
		Casilla cas4 = new Casilla();
		Casilla cas5 = new Casilla();
		Casilla cas6 = new Casilla();
		cas3.posiciones(5, 4);
		cas4.posiciones(10, 9);
		cas5.posiciones(1, 1);
		cas6.posiciones(14, 14);
		
		//Dentro del rango
		assertTrue(cas3.dentroRango(6));
		assertTrue(cas4.dentroRango(12));
		assertTrue(cas5.dentroRango(5));
		assertTrue(cas6.dentroRango(15));
		
		//Fuera de rango
		assertFalse(cas3.dentroRango(5));
		assertFalse(cas4.dentroRango(8));
		assertFalse(cas5.dentroRango(1));
		assertFalse(cas6.dentroRango(14));
	}
	
	@Test
	void testPosiciones() {
		Casilla cas1 = new Casilla();
		cas1.posiciones(4, 5);
		
		assertEquals(4, cas1.getX());
		assertEquals(5, cas1.getY());
		
		assertNotEquals(5, cas1.getX());
		assertNotEquals(4, cas1.getY());
	}
	//Per realitzar diferents test de coverage amb el valor de la casilla
	//(s'ha de jugar amb els valors)
	@Test
	void testCcasillasetvalor() {
		Casilla casilla=new Casilla();
		casilla.posiciones(0,0);
		casilla.setValor(2);
		casilla.setValor(1);
		casilla.valor = 8;
		casilla.setValor(1);
		casilla.setValor(-1);
		
	}
}
