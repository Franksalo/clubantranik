package com.intech.antranik.backend.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.intech.antranik.backend.dao.constants.Queries;
import com.intech.antranik.backend.dao.interfaces.ICategoryDao;
import com.intech.antranik.backend.model.Category;

public class CategoryDao extends AbstractDao implements ICategoryDao {

    @Transactional
    @Override
    public List<Category> listAllCategories() {
        TypedQuery<Category> query = entityManager.createNamedQuery(
                Queries.CATEGORY_GET_ALL, Category.class);
        List<Category> categories;
        try {
            categories = query.getResultList();
        } catch (NoResultException ex) {
            categories = new ArrayList<>();
        }
        return categories;
    }

    @Transactional
    @Override
    public Category findById(int id) {
        Category category = entityManager.find(Category.class, id);
        return category;
    }

    @Transactional
    @Override
    public void saveCategory(Category category) {
        entityManager.persist(category);
        entityManager.flush();
    }

    @Transactional
    @Override
    public void updateCategory(Category category) {
        entityManager.merge(category);
        entityManager.flush();
    }

    @Transactional
    @Override
    public void deleteCategory(Category category) {
        entityManager.detach(category);
        entityManager.flush();
    }

    @Transactional
    @Override
    public boolean isCategoryExist(int id) {
        Category category = entityManager.find(Category.class, id);
        return category != null;
    }

}
