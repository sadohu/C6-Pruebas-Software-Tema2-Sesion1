package pe.edu.cibertec.Tema2Sesion1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tema2Sesion1ApplicationTest {

	@Test
	void contextLoads() {
	}

	@Test
	public void ejemploAssertEquals1() {
		assertEquals(1, 2);
	}

	@Test
	public void ejemploAssertEquals2() {
		assertEquals(2, 2);
	}

	@Test
	public void ejemploAssertEquals3() {
		assertEquals("2", 2);
	}

	@Test
	public void ejemploAssertEquals4() {
		assertEquals("2", "2");
	}


	@Test
	public void ejemploAssertEquals5() {
		assertEquals(2, 2.0);
	}

	@Test
	public void ejemploAssertEquals6() {
		assertEquals(2.0, 2.0);
	}

	@Test
	public void ejemploAssertEquals7() {
		double a = 2.0;
		double b = 2.0;
		assertEquals(a, b);
	}

	@Test
	public void ejemploAssertEquals8() {
		BigDecimal a = BigDecimal.valueOf(2.0).setScale(1, RoundingMode.UP);
		BigDecimal b = BigDecimal.valueOf(2.0).setScale(1, RoundingMode.UP);
		assertEquals(a, b);
	}

	@Test
	public void ejemploAssertEquals9() {
		assertEquals('2', 2);
	}

	@Test
	public void ejemploAssertEquals10() {
		String a = "hola";
		String b = "hol"+"a";
		String c = b;

		assertEquals(a, c);
	}

	@Test
	public void ejemploAssertTrue1() {
        assertEquals(1, 1);
	}

	@Test
	public void ejemploAssertTrue2() {
        assertEquals(1, 2);
	}

	@Test
	public void ejemploAssertTrue3() {
		assertTrue(1 != 2);
	}

	@Test
	public void ejemploAssertTrue4() {
        assertEquals(2.0, 2.0);
	}

	@Test
	public void ejemploAssertTrue5() {
        assertEquals(2.1, 2.10);
	}

	@Test
	public void ejemploAssertFalse1() {
        assertNotEquals(1, 1);
	}

	@Test
	public void ejemploAssertFalse2() {
        assertNotEquals(1, 2);
	}

	@Test
	public void ejemploAssertFalse3() {
		assertFalse(1 != 2);
	}

	@Test
	public void ejemploAssertFalse4() {
		assertFalse(2.0 != 2.0);
	}

	@Test
	public void ejemploAssertFalse5() {
		assertFalse(2.1 != 2.10);
	}

	@Test
	public void ejemploAssertNull1() {
		String nombre=null;
		assertNull(nombre);
	}

	@Test
	public void ejemploAssertNull2() {
		String nombre="a";
		assertNull(nombre);
	}

	@Test
	void ejemploAssertNotNull1() {
		String nombre=null;
		assertNotNull(nombre);
	}

	@Test
	public void ejemploAssertNotNull2() {
		String nombre="a";
		assertNotNull(nombre);
	}

	@Test
	public void ejemploAssertSame1() {
		assertSame("Hola","Hola");
	}

	@Test
	public void ejemploAssertSame2() {
		assertSame("Hola","HolA");
	}

	@Test
	public void ejemploAssertSame3() {
		String nombre1="Hola";
		String nombre2="Hola";
		assertSame(nombre1, nombre2);
	}

	@Test
	public void ejemploAssertSame4() {
		assertSame('2', 2);
	}

	@Test
	public void ejemploAssertSame5() {
		assertSame("2", 2);
	}

	@Test
	public void ejemploAssertSame6() {
		assertSame(2, 2);
	}

	@Test
	public void ejemploAssertSame7() {
		String a = "hola";
		String b = "hol"+"a";
		String c = b;

		assertSame(a, c);
	}

	@Test
	public void ejemploAssertNotSame1() {
		assertNotSame("Hola","Hola");
	}

	@Test
	public void ejemploAssertNotSame2() {
		assertNotSame("Hola","HolA");
	}

	@Test
	public void ejemploAssertNotSame3() {
		String nombre1="Hola";
		String nombre2="Hola";
		assertNotSame(nombre1, nombre2);
	}

	@Test
	public void ejemploAssertArrayEquals1() {
		String[] nombres1 = { "java", "junit", "jboss" };
		String[] nombres2 = { "java", "junit", "jboss" };
		assertArrayEquals(nombres1, nombres2);
	}

	@Test
	public void ejemploAssertArrayEquals2() {
		String[] nombres1 = { "java", "junit", "jboss" };
		String[] nombres2 = { "java", "junit", "jbosS" };
		assertArrayEquals(nombres1, nombres2);
	}
}
