package deep.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import deep.shoppingbackend.dao.CategoryDAO;
import deep.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();

	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Telivision");
        category.setDescription("Visual Effect");
		category.setImageURL("cat_1.png");
		
		categories. add(category);
		
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
        category.setDescription("Everything in one touch");
		category.setImageURL("cat_2.png");
		
		categories. add(category);
        
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
        category.setDescription("Compact Device");
		category.setImageURL("cat_3.png");
		
		categories. add(category);

	}
	
	

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories){
			
			if(category.getId() == id) return category;
		}
			
		return null;
	}



	@Override
	@Transactional
	public boolean add(Category category) {
		// TODO Auto-generated method stub

		try {

			sessionFactory.getCurrentSession().persist(category);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();

		return false;
	}

}
}