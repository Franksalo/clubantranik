package com.intech.antranik.backend.dao.interfaces;

import java.util.List;

import com.intech.antranik.backend.model.Category;

public interface ICategoryDao {

    List<Category> listAllCategories();

    Category findById(int id);

    void saveCategory(Category category);

    void updateCategory(Category category);

    void deleteCategory(Category category);

    boolean isCategoryExist(int id);
}
