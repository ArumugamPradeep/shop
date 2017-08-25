package deep.shoppingbackend.dao;

import java.util.List;

import deep.shoppingbackend.dto.Address;
import deep.shoppingbackend.dto.Cart;
import deep.shoppingbackend.dto.User;

public interface UserDAO {

	    //add an user
		boolean addUser(User user);
		
		User getByEmail(String email);
		
		// add an address
		boolean addAddress(Address address);
		Address getBillingAddress(User user);
		List<Address> listShippingAddresses(User user);
		
		
		
		//add an cart
		boolean updateCart(Cart cart);
	
}
