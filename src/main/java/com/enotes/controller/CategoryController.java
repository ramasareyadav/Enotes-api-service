package com.enotes.controller;

import com.enotes.entity.Category;
import com.enotes.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/savecat")
    public Boolean savecategory(@RequestBody Category category)
    {
        Boolean savecategory = categoryService.saveCategory(category);
        return savecategory;
    }
    @GetMapping("/getAll")
    public List<Category> categoryList()
    {
        return categoryService.getAllCategory();
    }
}
