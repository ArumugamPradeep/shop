package deep.shoppingbackend.dao;

import java.util.List;

import deep.shoppingbackend.dto.Address;
import deep.shoppingbackend.dto.User;

public interface UserDAO {

	    //add an user
		boolean addUser(User user);
		
		User getByEmail(String email);
		
		// add an address
		boolean addAddress(Address address);
		Address getBillingAddress(User user);
		List<Address> listShippingAddresses(User user);
		
		// alternative
		 //Address getBillingAddress(int userId);
		//List<Address> listShippingAddresses(int userId);
		
		
		//add an cart
		//boolean updateCart(Cart cart);
	
}
