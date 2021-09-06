package anotacionestestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotacionesBasicas {
	
	@BeforeClass
	public void codigoAntesClase() {
		//Rutina de codigo antes de la clase
		System.out.println("Este C�digo se ejecuta antes de la clase");
	}
	
	@AfterClass
	public void codigoDespuesClase() {
		//Rutina de codigo despues de la clase
		System.out.println("Este C�digo se ejecuta despues de la clase");		
	}
	
	@BeforeSuite
	public void codigoAntesSuite() {
		//Rutina de codigo despues de la clase
		System.out.println("Este C�digo se ejecuta antes de toda la suite");				
	}
	
	@AfterSuite
	public void codigoDespuesSuite() {
		//Rutina de codigo despues de la clase
		System.out.println("Este C�digo se ejecuta despues de toda la suite");				
	}

	
	@BeforeMethod()
	public void antesDelMetodo() {
		//Rutina de c�digo que se ejecuta antes de cada m�todo con anotacion test
		System.out.println("Estos codigos se ejecutan antes de cada test");
	}
	

	@AfterMethod()
	public void despuesDelMetodo() {
		//Rutina de c�digo que se ejecuta despues de cada m�todo con anotacion test
		System.out.println("Estos codigos se ejecutan despues de cada test");
	}

	@BeforeTest
	public void antesSetTest() {
		//Rutina de c�digo que se ejecuta en cada set de pruebas seg�n el archivo xml
		System.out.println("Estos codigos se ejecutan antes de todos los archivo incluidos en el set de pruebas del xml");
		
	} 

	@AfterTest
	public void despuesSetTest() {
		//Rutina de c�digo que se ejecuta en cada set de pruebas seg�n el archivo xml
		System.out.println("Estos codigos se ejecutan despues de todos los archivos incluido en el set de pruebas");
		
	} 

	@Test(groups= {"functional"})
	public void pruebaUno() {
		//Rutina de c�digo para correr la prueba, generalmente esta todo el c�digo de selenium
		System.out.println("Esta es la prueba uno y funcional");
		
	}

	@Test(dependsOnMethods={"pruebaUno"})
	public void pruebaDos() {
		//Rutina de c�digo para correr la prueba, generalmente esta todo el c�digo de selenium
		System.out.println("Esta es la prueba dos");
		
	}

}
