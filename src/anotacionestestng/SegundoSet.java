package anotacionestestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SegundoSet {
	@Test
	public void pruebaTres() {
		System.out.println("Esta es la prueba tres del segundo set");
	}

	@Test(dependsOnMethods={"pruebaTres"})
	public void pruebaCuatro() {
		System.out.println("Esta es la prueba cuatro del segundo set");
	}
	
	@Test(enabled=true)
	public void pruebaCinco() {
		Assert.assertTrue(false);
		System.out.println("Esta es la prueba quinta del segundo set");
	}
	
	@Test
	public void clicAlHomePage() {
		System.out.println("clic Al Home");		
	} 

	@Test(groups= {"functional"}, dataProvider="getData")
	public void clicAlCarrito(String producto, String precio) {
		System.out.println("clic Al Carrito y funcional con el producto: " + producto + ", Precio " + precio);				
	} 

	@Parameters({"userName", "password"})
	@Test
	public void clicAlUsuario(String methodUserName, String methodPassword) {
		System.out.println("Clic Al Usuario con nombre: "+methodUserName + ", Con el password: " + methodPassword);		
	} 
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] productos = new Object[3][2];
		
		//Primer Articulo
		productos[0][0] = "Camisa";
		productos[0][1] = "$10,00";
		
		//Segundo Articulo
		productos[1][0] = "Pantalon";
		productos[1][1] = "$12,00";

		//Tercer Articulo
		productos[2][0] = "Falda";
		productos[2][1] = "$14,00";

		return productos;
	}

}
