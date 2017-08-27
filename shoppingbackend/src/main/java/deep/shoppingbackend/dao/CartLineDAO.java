package deep.shoppingbackend.dao;

import java.util.List;

import deep.shoppingbackend.dto.Cart;
import deep.shoppingbackend.dto.CartLine;

public interface CartLineDAO {

	public CartLine get(int id);
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);
	public List<CartLine> list(int cartId);
	
	
	// other business methods related to cart lines
	
	public List<CartLine> listAvailable(int cartId);
	public CartLine getByCartAndProduct(int cartId, int productId);
	
	
	// update a cart
	boolean updateCart(Cart cart);
	

	
	
}
