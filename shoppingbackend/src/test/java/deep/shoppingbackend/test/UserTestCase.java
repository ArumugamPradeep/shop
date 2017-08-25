package deep.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import deep.shoppingbackend.dao.UserDAO;
import deep.shoppingbackend.dto.Address;
import deep.shoppingbackend.dto.Cart;
import deep.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("deep.shoppingbackend");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
	}

	/*
	 * @Test public void testAdd() {
	 * 
	 * user = new User(); user.setFirstName("Pradeep");
	 * user.setLastName("Chintu"); user.setEmail("pradeepugamathi@gmail.com");
	 * user.setContactNumber("9999999999"); user.setRole("USER");
	 * user.setPassword("666666");
	 * 
	 * // add the user
	 * 
	 * assertEquals("Failed to add user!", true, userDAO.addUser(user));
	 * 
	 * address = new Address();
	 * address.setAddressLineOne("21/c Anglamman koil");
	 * address.setAddressLineTwo("JaiNagar,Pattalam");
	 * address.setCity("Chennai"); address.setState("TamilNadu");
	 * address.setCountry("India"); address.setPostalCode("600012");
	 * address.setBilling(true);
	 * 
	 * // link the user with the address user id
	 * 
	 * address.setUserId(user.getId()); // add the address
	 * 
	 * assertEquals("Failed to add address!", true,
	 * userDAO.addAddress(address));
	 * 
	 * if(user.getRole().equals("USER")) {
	 * 
	 * // create a cart for this user
	 * 
	 * cart = new Cart();
	 * 
	 * cart.setUser(user);
	 * 
	 * //add the cart assertEquals("Failed to add cart!",true,
	 * userDAO.addCart(cart));
	 * 
	 * // add a shipping address for this year
	 * 
	 * address = new Address();
	 * address.setAddressLineOne("21/c Anglamman koil");
	 * address.setAddressLineTwo("JaiNagar,Pattalam");
	 * address.setCity("Chennai"); address.setState("TamilNadu");
	 * address.setCountry("India"); address.setPostalCode("600012"); //set
	 * shipping to true address.setShipping(true);
	 * 
	 * // link with the user address.setUserId(user.getId());
	 * 
	 * // add the shipping address
	 * assertEquals("Failed to add shipping address!",
	 * true,userDAO.addAddress(address));
	 * 
	 * }
	 * 
	 * }
	 */

	/*@Test
	public void testAdd() {
		user = new User();
		user.setFirstName("Pradeep");
		user.setLastName("Chintu");
		user.setEmail("pradeepugamathi@gmail.com");
		user.setContactNumber("9999999999");
		user.setRole("USER");
		user.setPassword("666666");

		if (user.getRole().equals("USER")) {
			// create a cart for this user
			cart = new Cart();

			cart.setUser(user);
			// attach cart with the user
			user.setCart(cart);

		}

		// add the user
		assertEquals("Failed to add user!", true, userDAO.addUser(user));

	}*/

	/*@Test
	public void testUpdateCart() {
		
		//fetch the user by its email
		
		user = userDAO.getByEmail("pradeepugamathi@gmail.com");
		
		// get the cart of the user
		
		cart = user.getCart();
		
		cart.setGrandTotal(5555);
		
		cart.setCartLines(2);
		
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));
		
	}
*/	
 
	/*@Test
	public void testAddAddress() {
		// we need to add an user
		 user = new User(); user.setFirstName("Pradeep");
		 user.setLastName("Chintu"); 
		 user.setEmail("pradeepugamathi@gmail.com");
		 user.setContactNumber("9999999999"); 
		 user.setRole("USER");
		 user.setPassword("666666");
		 

		// add the user
		 
		  assertEquals("Failed to add user!", true, userDAO.addUser(user));
		  
		  //add address
		  
		  address = new Address();
		  address.setAddressLineOne("21/c Anglamman koil");
		  address.setAddressLineTwo("JaiNagar,Pattalam");
		  address.setCity("Chennai");
		  address.setState("TamilNadu");
		  address.setCountry("India");
		  address.setPostalCode("600012");
		  address.setBilling(true);
		  
	     //attach user to address
		  address.setUser(user);
			assertEquals("Failed to add address!",true, userDAO.addAddress(address));
			
			// add a shipping address for this year
			 
			  address = new Address();
			  address.setAddressLineOne("21/c Anglamman koil");
			  address.setAddressLineTwo("JaiNagar,Pattalam");
			  address.setCity("Chennai"); 
			  address.setState("TamilNadu");
			  address.setCountry("India");
			  address.setPostalCode("600012");
			  
			//  set shipping to true 
			  address.setShipping(true);
			  
			  address.setUser(user);
			  assertEquals("Failed to add shipping address!",
						  true,userDAO.addAddress(address));
	}
*/
	/*@Test
	public void testAddAddress() {
		
		user = userDAO.getByEmail("pradeepugamathi@gmail.com");
		
		 address = new Address();
		  address.setAddressLineOne("201/c Hanumaan koil");
		  address.setAddressLineTwo("VIKKAS GARDEN");
		  address.setCity("Allepey"); 
		  address.setState("Kerala");
		  address.setCountry("India");
		  address.setPostalCode("601430");
		  
		//  set shipping to true 
		  address.setShipping(true);
		  
		  address.setUser(user);
		  assertEquals("Failed to add shipping address!",
					  true,userDAO.addAddress(address));
}*/
	
	@Test
	public void testGetAddresses() {
		

		user = userDAO.getByEmail("pradeepugamathi@gmail.com");
		
		assertEquals("Failed to fetch the list of Address and Size does not match!",2,
				userDAO.listShippingAddresses(user).size());
		
		assertEquals("Failed to fetch the list the billing address and Size does not match!","Chennai",
				userDAO.getBillingAddress(user).getCity());
	}
	
	

	
}
