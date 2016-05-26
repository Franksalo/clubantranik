package com.intech.antranik.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intech.antranik.backend.dao.interfaces.ICategoryDao;
import com.intech.antranik.backend.model.Category;

public class CategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    public List<Category> listAllCategories() {
        return categoryDao.listAllCategories();
    }

    public Category findById(int id) {
        return categoryDao.findById(id);
    }

    public void saveCategory(Category category) {
        categoryDao.saveCategory(category);
    }

    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);
    }

    public boolean isCategoryExist(int id) {
        return categoryDao.isCategoryExist(id);
    }

}
