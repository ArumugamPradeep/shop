package deep.shoppingbackend.dao;

import java.util.List;

import deep.shoppingbackend.dto.Category;

public interface CategoryDAO {

	Category get(int id);
	List<Category> list();
	
	boolean add(Category category);
	
}
