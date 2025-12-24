package com.enotes.service.impl;

import com.enotes.entity.Category;
import com.enotes.repository.CategoryRepository;
import com.enotes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Boolean saveCategory(Category category) {
        category.setIsDeleted(false);
        Category saveCategory = categoryRepository.save(category);
        if(ObjectUtils.isEmpty(saveCategory))
        {
            return false;
        }
        return true;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> allCategory = categoryRepository.findAll();
        return allCategory;
    }
}
