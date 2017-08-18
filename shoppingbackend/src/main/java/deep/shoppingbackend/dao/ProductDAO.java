package deep.shoppingbackend.dao;

import java.util.List;

import deep.shoppingbackend.dto.Product;

public interface ProductDAO {

	Product get (int productId);
	List<Product> list();
		boolean add(Product product);
		boolean update(Product product);
		boolean delete(Product product);

	List<Product> listAciveProducts();
	List<Product> listAciveProductsByCategory(int categoryId);
	List<Product> getLatestAciveProducts(int count);	
	

	
	
}
