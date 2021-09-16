package ee.dmitri.backendnew.service;

import ee.dmitri.backendnew.model.Category;
import ee.dmitri.backendnew.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public void saveCategory(Category category){
        categoryRepository.save(category);
    }

}
