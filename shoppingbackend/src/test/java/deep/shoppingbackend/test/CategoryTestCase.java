package deep.shoppingbackend.test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import deep.shoppingbackend.dao.CategoryDAO;
import deep.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("deep.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	/*@Test

	public void testAddCategory() {

		category = new Category();

		category.setName("Television");
		category.setDescription("this the some description for television");
		category.setImageURL("image2.png");

		assertEquals("Successfully added a category inside the table", true, categoryDAO.add(category));

	}
*/
	
	@Test
	public void testCRUDCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("this the some description for television");
		category.setImageURL("image1.png");
		
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
		
		category = new Category();
		
		category.setName("Mobile");
		category.setDescription("this the some description for mobile");
		category.setImageURL("image2.png");
		
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
		
		
		//fetching and updating the category
		category = categoryDAO.get(2);
		
		category.setName("cell");
		
		assertEquals("Successfully fetched a single category in the table",true,categoryDAO.update(category));
		
		//delete the category

		assertEquals("Successfully deleted a single category in the table",true,categoryDAO.delete(category));
		
		
		//fetching the list
		
		assertEquals("Successfully fetched a single category in the table",1,categoryDAO.list().size());
		
		
		
	}
	
	
	

	
	
	
	
}
