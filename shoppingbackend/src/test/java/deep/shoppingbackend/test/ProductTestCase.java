package deep.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import deep.shoppingbackend.dao.ProductDAO;
import deep.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private Product product;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("deep.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	/*@Test
	public void testCRUDCategory() {
         //ADD
		// create operation
		product = new Product();

		product.setName("oppo selfie s53");
		product.setBrand("oppo");
		product.setDescription("Description for oppo mobile");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		 
		assertEquals("Something went wrong while inserting a new product",true,productDAO.add(product));

		//reading and updating
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong while updating the exising record",true,productDAO.update(product));


		assertEquals("Something went wrong while deleting the  existing record",true,productDAO.delete(product));

		
		//FETCHING
		  assertEquals("Something went wrong while fetching the list of products",6, productDAO.list().size()); 
					
	}
*/
	
	@Test
	public void testListActiveProducts() {
		assertEquals("Something went wrong while fetching the list of products!",
				5,productDAO.listAciveProducts().size());
		
	}

	
	@Test
	public void testListActiveProductsByCategory() {
		
		assertEquals("Something went wrong while fetching the list of products!",3,productDAO.listAciveProductsByCategory(3).size());
		
		assertEquals("Something went wrong while fetching the list of products!",
				2,productDAO.listAciveProductsByCategory(1).size());
		
		
		
	}

	@Test
	public void testGetLatestActiveProduct() {
		
		assertEquals("Something went wrong while fetching the list of products!",
				3,productDAO.getLatestAciveProducts(3).size());
		
	
	
	}
		


	
}
